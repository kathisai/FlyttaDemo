package io.com.flyttademo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarkersResponse {

@SerializedName("_id")
@Expose
private String id;
@SerializedName("lat")
@Expose
private String lat;
@SerializedName("lon")
@Expose
private String lon;
@SerializedName("service_id")
@Expose
private String serviceId;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getLat() {
return lat;
}

public void setLat(String lat) {
this.lat = lat;
}

public String getLon() {
return lon;
}

public void setLon(String lon) {
this.lon = lon;
}

public String getServiceId() {
return serviceId;
}

public void setServiceId(String serviceId) {
this.serviceId = serviceId;
}

}