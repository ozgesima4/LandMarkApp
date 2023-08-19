package com.sima.landmarkapp;

import java.io.Serializable;

public class LandMark implements Serializable {
    String city;
    String name;
    int image;

    public  LandMark(String city,String name, int image){
        this.city=city;
        this.image=image;
        this.name=name;

    }

}
