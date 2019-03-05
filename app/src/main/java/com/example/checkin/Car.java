package com.example.checkin;

public class Car {

    private String registrationNumber;
    private int unitNumber;

    public Car(){

    }

    public Car(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public Car(String registrationNumber, int unitNumber){
        this.registrationNumber = registrationNumber;
        this.unitNumber = unitNumber;
    }

    public String getRegistrationNumber(){
         return this.registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    
    public int getUnitNumber(){
        return this.unitNumber;
    }

    public void setUnitNumber(int unitNumber){
        this.unitNumber = unitNumber;
    }
}
