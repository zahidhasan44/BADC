package com.example.badc.zahid;

import javafx.beans.property.SimpleStringProperty;

public class InspectionReport {
    private String reportId;
    private String reportDate;
    private String reportStatus;

    public InspectionReport() {
    }

    public InspectionReport(String reportId, String reportDate, String reportStatus) {
        this.reportId = reportId;
        this.reportDate = reportDate;
        this.reportStatus = reportStatus;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Override
    public String toString() {
        return "InspectionReport{" +
                "reportId='" + reportId + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", reportStatus='" + reportStatus + '\'' +
                '}';
    }
}
