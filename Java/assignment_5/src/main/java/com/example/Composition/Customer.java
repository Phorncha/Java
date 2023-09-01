package com.example.Composition;

// Customer
// - fullName: String
// - type: String
// + Customer(fullname:String, type:String)
// + getFullname(): String
// + getType(): String

public class Customer {
    private String fullName;
    private String type;

       // Constructor
    public Customer(String fullName, String type) {
        this.fullName = fullName;
        this.type = type;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getType(){
        return this.type;
    }
    
    public String getTString() {
        return "[Customer : " + fullName + "( " + type + ")]";
    }


}
