package com.example.badc.zahid;

import javafx.beans.property.SimpleStringProperty;

public class UserProfile {
    private String fullName;
    private String email;
    private String contactNo;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String nid;
    private String vehicleDetails;
    private String autobom;
    private String vehicleInfo;

    public UserProfile() {
    }

    public UserProfile(String fullName, String email, String contactNo, String gender, String dateOfBirth, String address, String nid, String vehicleDetails, String autobom, String vehicleInfo) {
        this.fullName = fullName;
        this.email = email;
        this.contactNo = contactNo;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.nid = nid;
        this.vehicleDetails = vehicleDetails;
        this.autobom = autobom;
        this.vehicleInfo = vehicleInfo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public String getAutobom() {
        return autobom;
    }

    public void setAutobom(String autobom) {
        this.autobom = autobom;
    }

    public String getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", nid='" + nid + '\'' +
                ", vehicleDetails='" + vehicleDetails + '\'' +
                ", autobom='" + autobom + '\'' +
                ", vehicleInfo='" + vehicleInfo + '\'' +
                '}';
    }
}
