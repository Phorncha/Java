package week_3;

public class testDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Dog kachen = new Dog();
	kachen.setSex('M');
	kachen.setNickName("");
	
	//kachen.nickName = "เม่น";
	//System.out.println(kachen.nickName+ " เป็นสุขันเพศ " + kachen.sex);
	System.out.println(kachen.getNickname()+" เป็นสุนัข " +kachen.getSex());
	}
	//----------gpt
//		Dog dog = new Dog();
//        dog.setNickname("Fido");
//        dog.setSex("u");
//        System.out.println("ชื่อเล่น: " + dog.getNickname());
//        System.out.println("เพศ: " + dog.getSex());
//    }

}
