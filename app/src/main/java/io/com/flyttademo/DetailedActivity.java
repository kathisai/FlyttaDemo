package io.com.flyttademo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.List;

import io.com.flyttademo.base.BaseActivity;
import io.com.flyttademo.model.MarkersResponse;
import io.com.flyttademo.model.ServiceResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailedActivity extends BaseActivity {
    private String serviceID;
    private String TAG = DetailedActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatailed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getExtras();
        if(serviceID!=null){
            toolbar.setTitle(serviceID);
            Call<ServiceResponse> call = getRetrofit().getServiceDeatail();
            call.enqueue(new Callback<ServiceResponse>() {
                @Override
                public void onResponse(Call<ServiceResponse> call, Response<ServiceResponse> response) {
                    Log.d(TAG, "onResponse: "+ response.body());
                }

                @Override
                public void onFailure(Call<ServiceResponse> call, Throwable t) {
                    Log.d(TAG, "onFailure: "+ t.getMessage());
                }
            });
        }

    }

    private void getExtras() {
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            if(bundle.containsKey("service_id")){
                serviceID = bundle.getString("service_id");
            }
        }else {
            serviceID = null;
        }
    }

}
