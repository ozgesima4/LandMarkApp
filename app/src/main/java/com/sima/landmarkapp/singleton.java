package com.sima.landmarkapp;

public class singleton {

    private LandMark sentlandmark;
    private static singleton Singleton;

   private singleton() {

    }

    public LandMark getSentlandmark() {
        return sentlandmark;
    }

    public void setSentlandmark(LandMark sentlandmark) {
        this.sentlandmark = sentlandmark;
    }

    public static singleton getInstance(){

        if(Singleton== null){
           Singleton=new singleton();
       }
       return Singleton ;
    }

}
