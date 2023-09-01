package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class TestDB {
    // ประกาศตัวแปรสำหรับใช้ติดต่อฐานข้อมูล
    private static Connection con;

    public static void main(String[] args) {
    }

    public static void findProductById(){

    
    try
    {
        // 1
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2
        String dbURL = "jdbc:mysql://localhost/blueshop?characterEncoding=utf-8";
        // 3
        con = DriverManager.getConnection(dbURL, "root", "");

        // 4. เตรียมคำสั่ง SQL ที่จะประมวลผล
        PreparedStatement pStatement = con.prepareStatement("SELECT * FROM product product WHERE pid =? or pname LIKE ?");
        // pStatement.setInt(1, 3);
        // pStatement.setString(2, "400");
        // 5. ส่งคำสั่ง SQL ไปยังฐานข้อมูล
        ResultSet resultSet = pStatement.executeQuery();

        // 6
        while (resultSet.next()) {
            int price = resultSet.getInt("price");
            double discount = price - (price * 0.05);
            System.out.println(resultSet.getString("pname") + " ราคา: " + price + "บาท ลดเหลือ :" + discount + "บาท");
            // System.out.println(discount);
        }

        // 7. ปิดการเชื่อมต่อ
        con.close();

        // //resultSet.next();
        // price = resultSet.getInt("price");
        // discount = price - (price * 0.05);
        // System.out.println(resultSet.getString("pname") + " ราคา: " + price + "บาท
        // ลดเหลือ :" + discount + "บาท");
        // // System.out.println(discount);

    }catch(
    ClassNotFoundException e)
    {
        System.err.println("Error loading driver: " + e);
    }catch(
    SQLException e)
    {
        System.err.println("Error database connection: " + e);
    }
}

}
