package io.com.flyttademo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import io.com.flyttademo.network.NetworkService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by saipratap on 3/17/18.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public NetworkService getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ec2-13-126-145-241.ap-south-1.compute.amazonaws.com:3013/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(NetworkService.class);
    }

}
