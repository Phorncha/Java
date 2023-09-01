package com.example.Polymorphism;



// implements Interface "Report" ใช้ implements
public class PM25Report implements Report {
    private int pm25Value;

    //Constructor รับค่า PM2.5 มาเก็บในตัวแปร
    public PM25Report(int pm25Value) {
        this.pm25Value = pm25Value;
    }

    // เมธอดที่ถูก implement จาก Interface Report
    @Override
    public String getReport() {
        return "PM2.5 Report: PM2.5 value is " + pm25Value;
    }
}
