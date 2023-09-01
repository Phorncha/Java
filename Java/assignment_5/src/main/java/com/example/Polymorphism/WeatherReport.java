package com.example.Polymorphism;

public class WeatherReport implements Report {
    private String weeatherData;

    public WeatherReport(String weeStringData) {
     
        this.weeatherData = weeatherData;
    }

    @Override
    public String getReport() {
        return "WeatherReport";
    }
    
}
