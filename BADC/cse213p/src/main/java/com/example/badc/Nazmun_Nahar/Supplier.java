package com.example.badc.Nazmun_Nahar;
 // Adjust the package name accordingly

public class Supplier {

    // Declare the attributes (fields)
    private String supplierId;
    private String name;
    private String contactInformation;
    private String address;
    private String productSupplied;
    private String businessLicense;
    private boolean isApproved;  // To track if the supplier is approved

    // Constructor to initialize the fields
    public Supplier(String name, String contactInformation, String address, String productSupplied, String businessLicense) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.address = address;
        this.productSupplied = productSupplied;
        this.businessLicense = businessLicense;
        this.isApproved = false;  // Default to false (not approved)
    }

    // Getter and Setter methods for each field

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProductSupplied() {
        return productSupplied;
    }

    public void setProductSupplied(String productSupplied) {
        this.productSupplied = productSupplied;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", name='" + name + '\'' +
                ", contactInformation='" + contactInformation + '\'' +
                ", address='" + address + '\'' +
                ", productSupplied='" + productSupplied + '\'' +
                ", businessLicense='" + businessLicense + '\'' +
                ", isApproved=" + isApproved +
                '}';
    }
}
