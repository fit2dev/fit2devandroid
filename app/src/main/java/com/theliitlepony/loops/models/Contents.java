package com.theliitlepony.loops.models;

/**
 * Created by user on 29 ต.ค. 2560.
 */

public class Contents {
    private String name;
    private String telNumber;
    private String statusParent;
    private int image;


    public Contents() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getStatusParent() {
        return statusParent;
    }

    public void setStatusParent(String statusParent) {
        this.statusParent = statusParent;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
