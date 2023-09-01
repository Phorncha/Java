package com.example.Overload_Override;

public class SmartPhone extends Phone {
    private String cpu;

    // Constructor ใช้กำหนดชื่อรุ่นโทรศัพท์ ราคา และรุ่นซีพียู
    public SmartPhone(String model, int price, String cpu) {
        super(model, price);
        this.cpu = cpu;
    }

    // Override เมธอด getDiscount() เพื่อคำนวณส่วนลดราคา 15%
    @Override
    public int getDiscount() {
        return getPrice() * 15 / 100;
    }

    private int getPrice() {
        return 0;
    }

    // เมธอดคำนวณเงินต่อเดือน 6 เดือน
    public int paymentPerMonth() {
        return getPrice() / 6;
    }

    // Overload เมธอดคำนวณเงินต่อเดือนตามจำนวนเดือนที่กำหนด
    public int paymentPerMonth(int months) {
        return getPrice() / months;
    }

    // Override เมธอด print() เพื่อแสดงค่าใน object ของคลาส SmartPhone
    @Override
    public void print() {
        super.print();
        System.out.println("CPU: " + cpu);
    }
}
