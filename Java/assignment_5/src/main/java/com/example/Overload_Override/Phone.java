package com.example.Overload_Override;

public class Phone {

    protected String model;
    protected int price;

    // Constructor ใช้กำหนดค่าเริ่มต้น ชื่อรุ่นเป็นค่าว่าง และราคาให้เป็น 0
    public Phone() {
        this.model = "";
        this.price = 0;
    }

    // Constructor ใช้กำหนดชื่อรุ่นและราคาตามที่กำหนด
    public Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // เมธอดคำนวณส่วนลดราคา 10%
    public int getDiscount() {
        return price * 10 / 100;
    }

    // เมธอดแสดงค่าใน object
    public void print() {
        System.out.println("Model:" + model);
        System.out.println("Price:" + price +"$");
    }

}
