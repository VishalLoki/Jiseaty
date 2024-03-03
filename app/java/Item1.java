package com.example.jiseaty;

public class Item1 {
    String location_name;
    String location_name1;
    String image_Url;
    String latitude;
    String longitude;

    public Item1(String location_name, String location_name1, String image_Url, String latitude, String longitude) {
        this.location_name = location_name;
        this.location_name1 = location_name1;
        this.image_Url = image_Url;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getLocation_name1() {
        return location_name1;
    }

    public void setLocation_name1(String location_name1) {
        this.location_name1 = location_name1;
    }

    public String getImage_Url() {
        return image_Url;
    }

    public void setImage_Url(String image_Url) {
        this.image_Url = image_Url;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
