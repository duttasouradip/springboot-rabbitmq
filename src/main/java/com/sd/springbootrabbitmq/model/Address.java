package com.sd.springbootrabbitmq.model;

public class Address {

  private String houseNo;
  private String roadName;
  private String city;
  private String country;

  public Address(String houseNo, String roadName, String city, String country) {
    super();
    this.houseNo = houseNo;
    this.roadName = roadName;
    this.city = city;
    this.country = country;
  }

  public String getHouseNo() {
    return houseNo;
  }

  public void setHouseNo(String houseNo) {
    this.houseNo = houseNo;
  }

  public String getRoadName() {
    return roadName;
  }

  public void setRoadName(String roadName) {
    this.roadName = roadName;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Address [houseNo=");
    builder.append(houseNo);
    builder.append(", roadName=");
    builder.append(roadName);
    builder.append(", city=");
    builder.append(city);
    builder.append(", country=");
    builder.append(country);
    builder.append("]");
    return builder.toString();
  }
}
