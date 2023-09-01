package com.example.Composition;

// Invoice
// - id: String
// - customer: Customer
// - totalPrice: double
// + Invoice(id:String, customer:Customer, totalPrice:double)
// + printInvoice():void

public class Invoice {
    
    private String id;
    private Customer customer;
    private double totalPrice;

    //Construct
    public Invoice(String id, Customer customer, double totalPrice) {
        this.id = id;
        this.customer = customer;
        this.totalPrice = totalPrice;
    }

    public void printInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Customer Email: " + customer.getType());
        System.out.println("Total Price: $" + totalPrice);
    }

    public static void main(String[] args) {
        // สร้าง object Customer
        Customer customer = new Customer("John Doe", "Regular");

        // สร้าง object Invoice และประกอบ (Composition) กับ object Customer
        Invoice invoice = new Invoice("INV123", customer, 150.0);

        // เรียกใช้เมธอด printInvoice() เพื่อแสดงข้อมูลใน object Invoice
        invoice.printInvoice();
    }
}
   
