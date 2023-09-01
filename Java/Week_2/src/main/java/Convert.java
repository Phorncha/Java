import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	//ข้อ 1
      System.out.print("ป้อนตัวเลขที่หนึ่ง: ");
      double number1 = scanner.nextDouble();
    
      System.out.print("ป้อนตัวเลขที่สอง: ");
      double number2 = scanner.nextDouble();
    
      System.out.println("ผลบวก: " + (number1 + number2));
      System.out.println("ผลลบ: " + (number1 - number2));
      System.out.println("ผลคูณ: " + (number1 * number2));
      System.out.println("ผลหาร: " + (number1 / number2));
    
    	
    	
    	//ข้อ 2
    	int targetNumber = (int) (Math.random() * 10) + 1;

    	int guess;
    	int attempts = 0;
    	boolean isCorrect = false;

    	while (!isCorrect) {
    	    System.out.print("ทายเลข: ");
    	    guess = scanner.nextInt();
    	    attempts++;

    	    if (guess == targetNumber) {
    	        isCorrect = true;
    	    } else if (guess < targetNumber) {
    	        System.out.println("เลขที่ทายน้อยเกินไป ลองอีกครั้ง!");
    	    } else {
    	        System.out.println("เลขที่ทายมากเกินไป ลองอีกครั้ง!");
    	    }
    	}

    	System.out.println("ยินดีด้วย! คุณทายถูกแล้ว");
    	System.out.println("เลขที่ถูกต้องคือ " + targetNumber);
    	System.out.println("คุณใช้จำนวนครั้งในการทาย: " + attempts);
         
        scanner.close();
        
        
		
        
    }
}
