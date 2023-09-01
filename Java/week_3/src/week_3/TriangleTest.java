package week_3;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	 String answer = "y";

     while (answer.equalsIgnoreCase("y")) {
    System.out.println("ข้อ 2 :จงเขียนโปรแกรมที่ประกอบด้วย class Triangle ที่มี attributes และมีการห่อหุ่มข้อมูล");
	System.out.println("กรุณาใส่ค่าของฐาน(base) ของสามเเหลี่ยม");
	double base = scanner.nextDouble();
	
	System.out.println("กรุณาใส่ค่าของความสูง(height) ของสามเหลี่ยม");
	double height = scanner.nextDouble();
	
	//สร้าง object จาก class Triangle
	Triangle triangle = new Triangle();
	triangle.setBase(base);
	triangle.setHeight(height);
	
	//print
	System.out.println("พื้นที่ของสามเหลี่ยม" + triangle.getArea());
	//เริ่มคำสั่งอีกครั้ง
	System.out.println("ต้องการเพิ่มข้อมูลพนักงานคนอื่นหรือไม่? (ใช้ 'y' หรือ 'n'):");
    answer = scanner.next();
   scanner.nextLine(); // อ่านค่าบรรทัดใหม่
	}
	}

}
