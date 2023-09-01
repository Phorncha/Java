package com.cis;

public class Rectangle extends Shape {
    // Additional attribute
    private String color;

    // Constructor
    public Rectangle(int width, int height, String color) {
        super(width, height); 
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return getWidth() * getHeight(); // คำนวณพื้นที่สำหรับ Rectangle
    }
}

