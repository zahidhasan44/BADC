package com.example.badc.Hannan_Ashrafy;

import java.time.LocalDate;

public class Farmer {
    private  String name;
    private  String email;
    private int NID;
    private String Village;
    private LocalDate DOB;
    private String Streat;
    private int contact;
    private String gender;

    public Farmer(String name, String gender, int contact, String streat, LocalDate DOB, String village, int NID, String email) {
        this.name = name;
        this.gender = gender;
        this.contact = contact;
        Streat = streat;
        this.DOB = DOB;
        Village = village;
        this.NID = NID;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getStreat() {
        return Streat;
    }

    public void setStreat(String streat) {
        Streat = streat;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public int getNID() {
        return NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", NID=" + NID +
                ", Village='" + Village + '\'' +
                ", DOB=" + DOB +
                ", Streat='" + Streat + '\'' +
                ", contact=" + contact +
                ", gender='" + gender + '\'' +
                '}';
    }
}
