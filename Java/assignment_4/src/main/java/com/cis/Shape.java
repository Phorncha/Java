package com.cis;

public class Shape {
    // Attributes
    private int width;
    private int height;

    // Constructors
    public Shape() {
        this.width = 0;
        this.height = 0;
    }

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Setter methods
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        return 0.0; // คำนวณพื้นที่ในคลาส Shape เป็น 0.0
    }
}
