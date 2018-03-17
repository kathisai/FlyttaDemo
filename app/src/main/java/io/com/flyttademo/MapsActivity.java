package io.com.flyttademo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatCallback;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;

import java.util.ArrayList;
import java.util.List;

import io.com.flyttademo.base.BaseActivity;
import io.com.flyttademo.model.MarkersResponse;
import io.com.flyttademo.model.MyItem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapsActivity extends BaseActivity implements OnMapReadyCallback,ClusterManager.OnClusterItemClickListener {

    private GoogleMap mMap;
    private String TAG = MapsActivity.class.getSimpleName();
    private ArrayList<MarkersResponse> responses = new ArrayList<>();
    private ClusterManager<MyItem> mClusterManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Call<List<MarkersResponse>> call = getRetrofit().listLatLag();
        call.enqueue(new Callback<List<MarkersResponse>>() {
            @Override
            public void onResponse(Call<List<MarkersResponse>> call, Response<List<MarkersResponse>> response) {
                Log.d(TAG, "onResponse: "+ response.body());
                responses.addAll(response.body());
                setUpClusterer();

            }

            @Override
            public void onFailure(Call<List<MarkersResponse>> call, Throwable t) {
                Log.d(TAG, "onFailure: ");
            }
        });
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
    }

    private void setUpClusterer() {
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(17.4323867, 78.3741122)));
        // Initialize the manager with the context and the map.
        // (Activity extends context, so we can pass 'this' in the constructor.)
        mClusterManager = new ClusterManager<MyItem>(this, mMap);
        // Point the map's listeners at the listeners implemented by the cluster
        // manager.
        mMap.setOnCameraIdleListener(mClusterManager);
        mMap.setOnMarkerClickListener(mClusterManager);
        mClusterManager.setOnClusterItemClickListener(this);
        addItems();
    }

    private void addItems() {
        for (MarkersResponse item :
                responses) {
            MyItem offsetItem = new MyItem(Double.parseDouble(item.getLat()), Double.parseDouble(item.getLon()),item.getServiceId());
            mClusterManager.addItem(offsetItem);
        }
    }


    @Override
    public boolean onClusterItemClick(ClusterItem clusterItem) {
        Toast.makeText(this, "clicked on "+ clusterItem.getTitle(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MapsActivity.this, DetailedActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("service_id", clusterItem.getTitle());
        intent.putExtras(bundle);
        startActivity(intent);

        return true;
    }
}
