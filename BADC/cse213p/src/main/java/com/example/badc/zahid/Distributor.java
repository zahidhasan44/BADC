package com.example.badc.zahid;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Distributor {
    private String password;
    private String username;
    private String cropType;

    public Distributor(String password, String username, String cropType) {
        this.password = password;
        this.username = username;
        this.cropType = cropType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", cropType='" + cropType + '\'' +
                '}';
    }
}
