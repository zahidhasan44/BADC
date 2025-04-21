package com.example.badc.Hannan_Ashrafy;

public class Admin {
    private String name;
    private String password;
    private String email;
    private String DOB;
    private int phoneNumber;
    private String role;
    private String gender;
    private String address;
    private String displayUsers;

    public Admin(String name, String displayUsers, String address, String gender, String role, int phoneNumber, String DOB, String email, String password) {
        this.name = name;
        this.displayUsers = displayUsers;
        this.address = address;
        this.gender = gender;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.DOB = DOB;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayUsers() {
        return displayUsers;
    }

    public void setDisplayUsers(String displayUsers) {
        this.displayUsers = displayUsers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", DOB='" + DOB + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", role='" + role + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", displayUsers='" + displayUsers + '\'' +
                '}';
    }
}
