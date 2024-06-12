package com.khooch.onestopgroceries.entity;

public class Store {
    private String name;
    private String phoneNumber;
    private String[] localities;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getLocalities() {
        return localities;
    }

    public void setLocalities(String[] localities) {
        this.localities = localities;
    }
}
