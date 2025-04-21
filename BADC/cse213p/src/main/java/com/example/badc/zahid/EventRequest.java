package com.example.badc.zahid;

import java.time.LocalDate;

public class EventRequest {
    private String username;
    private String password;
    private String eventType;
    private List<Item> itemList;
    private String currentCrop;
    private boolean hasCrop;
    private LocalDate deliveryDate;
    private String farmerDetails;

    public EventRequest() {
    }

    public EventRequest(String username, String password, String eventType, List<Item> itemList, String currentCrop, boolean hasCrop, LocalDate deliveryDate, String farmerDetails) {
        this.username = username;
        this.password = password;
        this.eventType = eventType;
        this.itemList = itemList;
        this.currentCrop = currentCrop;
        this.hasCrop = hasCrop;
        this.deliveryDate = deliveryDate;
        this.farmerDetails = farmerDetails;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public String getCurrentCrop() {
        return currentCrop;
    }

    public void setCurrentCrop(String currentCrop) {
        this.currentCrop = currentCrop;
    }

    public boolean isHasCrop() {
        return hasCrop;
    }

    public void setHasCrop(boolean hasCrop) {
        this.hasCrop = hasCrop;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getFarmerDetails() {
        return farmerDetails;
    }

    public void setFarmerDetails(String farmerDetails) {
        this.farmerDetails = farmerDetails;
    }

    @Override
    public String toString() {
        return "EventRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", eventType='" + eventType + '\'' +
                ", itemList=" + itemList +
                ", currentCrop='" + currentCrop + '\'' +
                ", hasCrop=" + hasCrop +
                ", deliveryDate=" + deliveryDate +
                ", farmerDetails='" + farmerDetails + '\'' +
                '}';
    }
}
