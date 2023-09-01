package com.example.Polymorphism;

public class TestReport {
    public static void main(String[] args) {
        Report weatherReport = new WeatherReport("Sunny and clear skies");
        Report pm25Report = new PM25Report(20);
        Report peopleReport = new PeopleReport("Population growth in the city");

        System.out.println(weatherReport.getReport());
        System.out.println(pm25Report.getReport());
        System.out.println(peopleReport.getReport());
    }
}

