package week_3;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
        System.out.println("กรุณาใส่รหัสพนักงาน: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // อ่านค่าบรรทัดใหม่

        System.out.println("กรุณาใส่ชื่อ-สกุล พนักงาน:");
        String fullName = scanner.nextLine();

        System.out.println("ใส่เงินเดือนพนักงาน:");
        double salary = scanner.nextDouble();

        // สร้าง object จากคลาส Employee
        Employee employee = new Employee(id, fullName, salary);

        // แสดงข้อมูลพนักงาน
        System.out.println("รายละเอียดของพนักงาน:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Full Name: " + employee.getFullName());
        System.out.println("Salary: " + employee.getSalary());

        // คำนวณเงินเดือนทั้งปี
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("เงินเดือนประจำปี: " + annualSalary);

        // เพิ่มเงินเดือน 5%
        employee.increaseSalary(5);
        System.out.println("เงินเดือนเพิ่ม 5%: " + employee.getSalary());
        
        System.out.println("ต้องการเพิ่มข้อมูลพนักงานคนอื่นหรือไม่? (ใช้ 'y' หรือ 'n'):");
         answer = scanner.next();
        scanner.nextLine(); // อ่านค่าบรรทัดใหม่
        
        }  
    }
}

