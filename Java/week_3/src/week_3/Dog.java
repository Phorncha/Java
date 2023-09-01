package week_3;

public class Dog {
	private String nickName;
	private char sex;
	
	void setSex(char Sex) {
		if (Sex =='M'||Sex=='F') {
			sex = Sex;
	}else{
		System.out.println("กำหนดค่าเพศของสุนัขไม่ถูกต้อง");
	
	}
	}
	void setNickName(String newNickname) {
		if(newNickname.equals("")||newNickname==null){
			System.out.println("ไม่ควรเป็นค่าว่าง");
			
		}else {
			nickName = newNickname;
		}
	}

//getter method
	public String getNickname() {
		return nickName;
	}
	public char getSex() {
		return sex;
	}
}
//-------------Gpt
//public class Dog {
//    private String nickname;
//    private String sex;
//
//    public void setSex(String sex) {
//        if (nickname == null) {
//            System.out.println("Error: ยังไม่ได้กำหนดชื่อเล่นสุนัข");
//            return;
//        }
//
//        if (sex.equals("M") || sex.equals("F")) {
//            this.sex = sex;
//        } else {
//            System.out.println("Error: เพศสุนัขต้องเป็น 'M' หรือ 'F' เท่านั้น");
//        }
//    }
//
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public String getNickname() {
//        return nickname;
//    }
//}