package com.cis;

public class ShapeTest {
    public static void main(String[] args) {
        // สร้าง object จากคลาสแม่ Shape
        Shape shape = new Shape();
        System.out.println("Shape - Width: " + shape.getWidth() + ", Height: " + shape.getHeight());
        System.out.println("Shape - Area: " + shape.calculateArea());

        // สร้าง object จากคลาสลูก Rectangle
        Rectangle rectangle = new Rectangle(5, 10, "Red");
        System.out.println("Rectangle - Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight());
        System.out.println("Rectangle - Color: " + rectangle.getColor());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea());

        // เปลี่ยนค่า width, height และ color ของ Rectangle1
        rectangle.setWidth(18);
        rectangle.setHeight(12);
        rectangle.setColor("Blue");
        System.out.println("Rectangle - Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight());
        System.out.println("Rectangle - Color: " + rectangle.getColor());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea());
    }
}
