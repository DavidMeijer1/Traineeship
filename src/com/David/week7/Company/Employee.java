package com.David.week7.Company;

public class Employee {
    private final String name;
    private String address;
    private String phoneNumber;
    private float experienceInYears;

    public Employee(String name, String address, String phoneNumber, float experienceInYears){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.experienceInYears = experienceInYears;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(float experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
