package io.com.flyttademo.model;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

@SerializedName("_id")
@Expose
private String id;
@SerializedName("picurl")
@Expose
private List<String> picurl = null;
@SerializedName("city")
@Expose
private String city;
@SerializedName("area")
@Expose
private String area;
@SerializedName("youarethe")
@Expose
private String youarethe;
@SerializedName("what")
@Expose
private String what;
@SerializedName("lat")
@Expose
private String lat;
@SerializedName("lon")
@Expose
private String lon;
@SerializedName("configuration")
@Expose
private String configuration;
@SerializedName("totalArea")
@Expose
private String totalArea;
@SerializedName("size1")
@Expose
private String size1;
@SerializedName("bedrooms")
@Expose
private String bedrooms;
@SerializedName("bathrooms")
@Expose
private String bathrooms;
@SerializedName("balconies")
@Expose
private String balconies;
@SerializedName("fridge")
@Expose
private String fridge;
@SerializedName("beds")
@Expose
private String beds;
@SerializedName("ac")
@Expose
private String ac;
@SerializedName("curtains")
@Expose
private String curtains;
@SerializedName("geyser")
@Expose
private String geyser;
@SerializedName("tv")
@Expose
private String tv;
@SerializedName("maintenance")
@Expose
private String maintenance;
@SerializedName("washing")
@Expose
private String washing;
@SerializedName("purifier")
@Expose
private String purifier;
@SerializedName("microwave")
@Expose
private String microwave;
@SerializedName("sofa")
@Expose
private String sofa;
@SerializedName("m_rent")
@Expose
private String mRent;
@SerializedName("advance")
@Expose
private String advance;
@SerializedName("availability")
@Expose
private String availability;
@SerializedName("age")
@Expose
private String age;
@SerializedName("pooja")
@Expose
private String pooja;
@SerializedName("studyroom")
@Expose
private String studyroom;
@SerializedName("servant")
@Expose
private String servant;
@SerializedName("v_parking")
@Expose
private String vParking;
@SerializedName("atm")
@Expose
private String atm;
@SerializedName("fur")
@Expose
private String fur;
@SerializedName("security")
@Expose
private String security;
@SerializedName("maintain")
@Expose
private String maintain;
@SerializedName("backup")
@Expose
private String backup;
@SerializedName("play")
@Expose
private String play;
@SerializedName("elevator")
@Expose
private String elevator;
@SerializedName("intercom")
@Expose
private String intercom;
@SerializedName("gym")
@Expose
private String gym;
@SerializedName("swim")
@Expose
private String swim;
@SerializedName("internet")
@Expose
private String internet;
@SerializedName("water")
@Expose
private String water;
@SerializedName("a_ac")
@Expose
private String aAc;
@SerializedName("a_from")
@Expose
private String aFrom;
@SerializedName("floor")
@Expose
private String floor;
@SerializedName("p_floor")
@Expose
private String pFloor;
@SerializedName("project")
@Expose
private String project;
@SerializedName("rent_to")
@Expose
private String rentTo;
@SerializedName("agreement")
@Expose
private String agreement;
@SerializedName("parking")
@Expose
private String parking;
@SerializedName("power_backup")
@Expose
private String powerBackup;
@SerializedName("facing")
@Expose
private String facing;
@SerializedName("community")
@Expose
private String community;
@SerializedName("other_a")
@Expose
private String otherA;
@SerializedName("fur_kitchen")
@Expose
private String furKitchen;
@SerializedName("fur_ward")
@Expose
private String furWard;
@SerializedName("fur_others")
@Expose
private String furOthers;
@SerializedName("other_furniture")
@Expose
private String otherFurniture;
@SerializedName("loca")
@Expose
private String loca;
@SerializedName("edit_loca")
@Expose
private String editLoca;
@SerializedName("other_info")
@Expose
private String otherInfo;
@SerializedName("phone")
@Expose
private String phone;
@SerializedName("prop_name")
@Expose
private String propName;
@SerializedName("prop_user")
@Expose
private String propUser;
@SerializedName("prop_addr")
@Expose
private String propAddr;
@SerializedName("user")
@Expose
private String user;
@SerializedName("added_on")
@Expose
private String addedOn;
@SerializedName("service_id")
@Expose
private String serviceId;
@SerializedName("old_id")
@Expose
private String oldId;
@SerializedName("datetime")
@Expose
private String datetime;
@SerializedName("occupy_status")
@Expose
private String occupyStatus;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public List<String> getPicurl() {
return picurl;
}

public void setPicurl(List<String> picurl) {
this.picurl = picurl;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getArea() {
return area;
}

public void setArea(String area) {
this.area = area;
}

public String getYouarethe() {
return youarethe;
}

public void setYouarethe(String youarethe) {
this.youarethe = youarethe;
}

public String getWhat() {
return what;
}

public void setWhat(String what) {
this.what = what;
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

public String getConfiguration() {
return configuration;
}

public void setConfiguration(String configuration) {
this.configuration = configuration;
}

public String getTotalArea() {
return totalArea;
}

public void setTotalArea(String totalArea) {
this.totalArea = totalArea;
}

public String getSize1() {
return size1;
}

public void setSize1(String size1) {
this.size1 = size1;
}

public String getBedrooms() {
return bedrooms;
}

public void setBedrooms(String bedrooms) {
this.bedrooms = bedrooms;
}

public String getBathrooms() {
return bathrooms;
}

public void setBathrooms(String bathrooms) {
this.bathrooms = bathrooms;
}

public String getBalconies() {
return balconies;
}

public void setBalconies(String balconies) {
this.balconies = balconies;
}

public String getFridge() {
return fridge;
}

public void setFridge(String fridge) {
this.fridge = fridge;
}

public String getBeds() {
return beds;
}

public void setBeds(String beds) {
this.beds = beds;
}

public String getAc() {
return ac;
}

public void setAc(String ac) {
this.ac = ac;
}

public String getCurtains() {
return curtains;
}

public void setCurtains(String curtains) {
this.curtains = curtains;
}

public String getGeyser() {
return geyser;
}

public void setGeyser(String geyser) {
this.geyser = geyser;
}

public String getTv() {
return tv;
}

public void setTv(String tv) {
this.tv = tv;
}

public String getMaintenance() {
return maintenance;
}

public void setMaintenance(String maintenance) {
this.maintenance = maintenance;
}

public String getWashing() {
return washing;
}

public void setWashing(String washing) {
this.washing = washing;
}

public String getPurifier() {
return purifier;
}

public void setPurifier(String purifier) {
this.purifier = purifier;
}

public String getMicrowave() {
return microwave;
}

public void setMicrowave(String microwave) {
this.microwave = microwave;
}

public String getSofa() {
return sofa;
}

public void setSofa(String sofa) {
this.sofa = sofa;
}

public String getMRent() {
return mRent;
}

public void setMRent(String mRent) {
this.mRent = mRent;
}

public String getAdvance() {
return advance;
}

public void setAdvance(String advance) {
this.advance = advance;
}

public String getAvailability() {
return availability;
}

public void setAvailability(String availability) {
this.availability = availability;
}

public String getAge() {
return age;
}

public void setAge(String age) {
this.age = age;
}

public String getPooja() {
return pooja;
}

public void setPooja(String pooja) {
this.pooja = pooja;
}

public String getStudyroom() {
return studyroom;
}

public void setStudyroom(String studyroom) {
this.studyroom = studyroom;
}

public String getServant() {
return servant;
}

public void setServant(String servant) {
this.servant = servant;
}

public String getVParking() {
return vParking;
}

public void setVParking(String vParking) {
this.vParking = vParking;
}

public String getAtm() {
return atm;
}

public void setAtm(String atm) {
this.atm = atm;
}

public String getFur() {
return fur;
}

public void setFur(String fur) {
this.fur = fur;
}

public String getSecurity() {
return security;
}

public void setSecurity(String security) {
this.security = security;
}

public String getMaintain() {
return maintain;
}

public void setMaintain(String maintain) {
this.maintain = maintain;
}

public String getBackup() {
return backup;
}

public void setBackup(String backup) {
this.backup = backup;
}

public String getPlay() {
return play;
}

public void setPlay(String play) {
this.play = play;
}

public String getElevator() {
return elevator;
}

public void setElevator(String elevator) {
this.elevator = elevator;
}

public String getIntercom() {
return intercom;
}

public void setIntercom(String intercom) {
this.intercom = intercom;
}

public String getGym() {
return gym;
}

public void setGym(String gym) {
this.gym = gym;
}

public String getSwim() {
return swim;
}

public void setSwim(String swim) {
this.swim = swim;
}

public String getInternet() {
return internet;
}

public void setInternet(String internet) {
this.internet = internet;
}

public String getWater() {
return water;
}

public void setWater(String water) {
this.water = water;
}

public String getAAc() {
return aAc;
}

public void setAAc(String aAc) {
this.aAc = aAc;
}

public String getAFrom() {
return aFrom;
}

public void setAFrom(String aFrom) {
this.aFrom = aFrom;
}

public String getFloor() {
return floor;
}

public void setFloor(String floor) {
this.floor = floor;
}

public String getPFloor() {
return pFloor;
}

public void setPFloor(String pFloor) {
this.pFloor = pFloor;
}

public String getProject() {
return project;
}

public void setProject(String project) {
this.project = project;
}

public String getRentTo() {
return rentTo;
}

public void setRentTo(String rentTo) {
this.rentTo = rentTo;
}

public String getAgreement() {
return agreement;
}

public void setAgreement(String agreement) {
this.agreement = agreement;
}

public String getParking() {
return parking;
}

public void setParking(String parking) {
this.parking = parking;
}

public String getPowerBackup() {
return powerBackup;
}

public void setPowerBackup(String powerBackup) {
this.powerBackup = powerBackup;
}

public String getFacing() {
return facing;
}

public void setFacing(String facing) {
this.facing = facing;
}

public String getCommunity() {
return community;
}

public void setCommunity(String community) {
this.community = community;
}

public String getOtherA() {
return otherA;
}

public void setOtherA(String otherA) {
this.otherA = otherA;
}

public String getFurKitchen() {
return furKitchen;
}

public void setFurKitchen(String furKitchen) {
this.furKitchen = furKitchen;
}

public String getFurWard() {
return furWard;
}

public void setFurWard(String furWard) {
this.furWard = furWard;
}

public String getFurOthers() {
return furOthers;
}

public void setFurOthers(String furOthers) {
this.furOthers = furOthers;
}

public String getOtherFurniture() {
return otherFurniture;
}

public void setOtherFurniture(String otherFurniture) {
this.otherFurniture = otherFurniture;
}

public String getLoca() {
return loca;
}

public void setLoca(String loca) {
this.loca = loca;
}

public String getEditLoca() {
return editLoca;
}

public void setEditLoca(String editLoca) {
this.editLoca = editLoca;
}

public String getOtherInfo() {
return otherInfo;
}

public void setOtherInfo(String otherInfo) {
this.otherInfo = otherInfo;
}

public String getPhone() {
return phone;
}

public void setPhone(String phone) {
this.phone = phone;
}

public String getPropName() {
return propName;
}

public void setPropName(String propName) {
this.propName = propName;
}

public String getPropUser() {
return propUser;
}

public void setPropUser(String propUser) {
this.propUser = propUser;
}

public String getPropAddr() {
return propAddr;
}

public void setPropAddr(String propAddr) {
this.propAddr = propAddr;
}

public String getUser() {
return user;
}

public void setUser(String user) {
this.user = user;
}

public String getAddedOn() {
return addedOn;
}

public void setAddedOn(String addedOn) {
this.addedOn = addedOn;
}

public String getServiceId() {
return serviceId;
}

public void setServiceId(String serviceId) {
this.serviceId = serviceId;
}

public String getOldId() {
return oldId;
}

public void setOldId(String oldId) {
this.oldId = oldId;
}

public String getDatetime() {
return datetime;
}

public void setDatetime(String datetime) {
this.datetime = datetime;
}

public String getOccupyStatus() {
return occupyStatus;
}

public void setOccupyStatus(String occupyStatus) {
this.occupyStatus = occupyStatus;
}

}
