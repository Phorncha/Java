package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCStep {
	// ประกาศตัวแปรสำหรับใช้ติดต่อฐานข้อมูล
	private static Connection con;

	public static void main(String[] args) {

	    try {
	        // 1. โหลด JDBC Driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // 2. กำหนด URL สำหรับติดต่อกับฐานข้อมูล
	        String dbURL = "jdbc:mysql://localhost/blueshop?characterEncoding=utf-8";
	        
	        // 3. เชื่อมต่อกับฐานข้อมูล
	        con = DriverManager.getConnection(dbURL, "root", "");
	        
	        // 4. เตรียมคำสั่ง SQL ที่จะประมวลผล
	        PreparedStatement pStatement = con.prepareStatement("SELECT * FROM product WHERE pid = ? or pname LIKE ?"); 
	        pStatement.setInt(1, 3);
	        pStatement.setString(2, "g%");
	        
	        // 5. ส่งคำสั่ง SQL ไปยังฐานข้อมูล
	        ResultSet resultSet = pStatement.executeQuery();

	        // 6. อ่านผลลัพธ์ที่ฐานข้อมูลส่งกลับ
	        while (resultSet.next()) {
	            int pid = resultSet.getInt("pid");  
	            String pname = resultSet.getString("pname");
	            String pdetail = resultSet.getString("pdetail");
	            int price = resultSet.getInt("price");
	            System.out.println(pid + "," + pname + "," + pdetail + "," + price);
	        }
		// 7. ปิดการเชื่อมต่อ
	        con.close();

	    } catch (ClassNotFoundException e) {
	        System.err.println("Error loading driver: " + e);
	    } catch (SQLException e) {
	        System.err.println("Error database connection: " + e);
	    }


	}

}

