package io.com.flyttademo.network;

import java.util.List;

import io.com.flyttademo.model.MarkersResponse;
import io.com.flyttademo.model.ServiceResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkService {
  @GET("flytta_api/v0.1/portal/showlatlon")
  Call<List<MarkersResponse>> listLatLag();

  @GET("flytta_api/v0.1/portal/property/findserviceid/RK5SUDXNZ")
  Call<ServiceResponse> getServiceDeatail();
}