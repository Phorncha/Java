
public class learnfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//เขียนโปรแกรมหาค่าผลรวมของ  1/1+1/2+1/3+1/4....+1/100
		double sum = 0;
//		for(int i= 1; i<=100; i++) {
//			//System.out.println(1.0/i);
//			sum = sum + 1d/i;	
//		}
		int i = 1;
		while(i<100) {
			sum = sum + 1d/i;
			i++;
		}
		System.out.println(sum);
	}

}
