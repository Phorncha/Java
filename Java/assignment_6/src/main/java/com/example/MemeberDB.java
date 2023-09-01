package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.xdevapi.PreparableStatement;

public class MemeberDB {

    // ประกาศตัวแปรสำหรับใช้ติดต่อฐานข้อมูล
    private static Connection con;

    public static void findAll() {

        try {
            // 1. โหลด JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. กำหนด URL สำหรับติดต่อกับฐานข้อมูล
            String dbURL = "jdbc:mysql://localhost/blueshop?characterEncoding=utf-8";

            // 3. เชื่อมต่อกับฐานข้อมูล
            con = DriverManager.getConnection(dbURL, "root", "");

            // 4. เตรียมคำสั่ง SQL ที่จะประมวลผล
            PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member");
            // pStatement.setInt(1, 3);
            // pStatement.setString(2, "g%");

            // 5. ส่งคำสั่ง SQL ไปยังฐานข้อมูล
            ResultSet resultSet = pStatement.executeQuery();

            // 6. อ่านผลลัพธ์ที่ฐานข้อมูลส่งกลับ
            while (resultSet.next()) {
                // int pid = resultSet.getInt("pid");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String mobile = resultSet.getString("mobile");
                String email = resultSet.getString("email");

                int columnWidth = 10;

                String formattedUsername = String.format("%-" + columnWidth + "s", username);
                String formattedPassword = String.format("%-" + columnWidth + "s", password);
                String formattedName = String.format("%-" + columnWidth + "s", name);
                String formattedAddress = String.format("%-" + columnWidth + "s", address);
                String formattedMobile = String.format("%-" + columnWidth + "s", mobile);
                String formattedEmail = String.format("%-" + columnWidth + "s", email);
                System.out.println(formattedUsername + " | " + formattedPassword + " | " + formattedName + " | "
                        + formattedAddress + " | " + formattedMobile + " | " + formattedEmail);

                System.out.println(
                        "------------------------------------------------------------------------------------------------------|");

            }
            // 7. ปิดการเชื่อมต่อ
            con.close();

        } catch (ClassNotFoundException e) {
            System.err.println("Error loading driver: " + e);
        } catch (SQLException e) {

            System.err.println("Error database connection: " + e);
        }
    }

    public static void findOne(String username) {
        try {
            // 1. โหลด JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. กำหนด URL สำหรับติดต่อกับฐานข้อมูล
            String dbURL = "jdbc:mysql://localhost/blueshop?characterEncoding=utf-8";
            // 3. เชื่อมต่อกับฐานข้อมูล
            con = DriverManager.getConnection(dbURL, "root", "");
            // 4. เตรียมคำสั่ง SQL ที่จะประมวลผล
            PreparedStatement pStatement = con.prepareStatement("SELECT * FROM member WHERE username = ? ");
            // 5. ส่งคำสั่ง SQL ไปยังฐานข้อมูล
            pStatement.setString(1, username);
            ResultSet resultSet = pStatement.executeQuery();
            // 6. อ่านผลลัพธ์ที่ฐานข้อมูลส่งกลับ
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username") + " ");
                System.out.print(resultSet.getString("password") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("address") + " ");
                System.out.print(resultSet.getString("mobile") + " ");
                System.out.print(resultSet.getString("email") + " " + "\n");

            }
            // 7. ปิดการเชื่อมต่อ
            con.close();

        } catch (ClassNotFoundException e) {
            System.err.println("Error loading driver: " + e);
        } catch (SQLException e) {

            System.err.println("Error database connection: " + e);
        }

    }

    public static void main(String[] args) {
        System.out.println(
                "------------------------------------------------------------------------------------------------------|");
        System.out.println("FindAll = :");
        System.out.println(
                "------------------------------------------------------------------------------------------------------|");
        findAll();
        System.out.println("");

        System.out.println(
                "-------------------------|");
        System.out.println("FindOne = :");
        findOne("somsak");
        System.out.println(
                "-------------------------|");
    }

}
