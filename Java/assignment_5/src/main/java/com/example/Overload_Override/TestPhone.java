package com.example.Overload_Override;

public class TestPhone {
    public static void main(String[] args) {
        // สร้าง object จากคลาสแม่ (Phone)
        Phone phone1 = new Phone(); // เรียก constructor ให้กำหนดค่าเริ่มต้น
        phone1.print(); // Output: Model:  Price: 0$

        Phone phone2 = new Phone("Samsung Galaxy S21", 900); // เรียก constructor ที่กำหนดค่า
        phone2.print(); // Output: Model: Samsung Galaxy S21 Price: 900$

        // คำนวณและแสดงส่วนลดราคาโทรศัพท์
        int discount1 = phone2.getDiscount();
        System.out.println("Discount: $" + discount1); // Output: Discount: $90

        // สร้าง object จากคลาสลูก (SmartPhone)
        SmartPhone smartPhone1 = new SmartPhone("iPhone 13", 1000, "A14 Bionic");
        smartPhone1.print(); // Output: Model: iPhone 13 Price: 1000$ CPU: A14 Bionic

        // คำนวณและแสดงส่วนลดราคาโทรศัพท์
        int discount2 = smartPhone1.getDiscount();
        System.out.println("Discount: $" + discount2); // Output: Discount: $150

        // คำนวณและแสดงค่าเงินต่อเดือน 6 เดือน
        int payment6Months = smartPhone1.paymentPerMonth();
        System.out.println("Payment per month (6 months): $" + payment6Months);

        // คำนวณและแสดงค่าเงินต่อเดือน 12 เดือน
        int payment12Months = smartPhone1.paymentPerMonth(12);
        System.out.println("Payment per month (12 months): $" + payment12Months);
    }
}
