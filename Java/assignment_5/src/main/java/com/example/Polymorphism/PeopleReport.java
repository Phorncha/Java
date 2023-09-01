package com.example.Polymorphism;


// implements Interface "Report" ใช้ implements
public class PeopleReport implements Report {
    private String reportData;
 // Constructor รับข้อมูลรายงานเกี่ยวกับคนมาเก็บในตัวแปร
    public PeopleReport(String reportData) {
        this.reportData = reportData;
    }

    @Override
    public String getReport() {
        return "People Report: " + reportData;
    }
}

