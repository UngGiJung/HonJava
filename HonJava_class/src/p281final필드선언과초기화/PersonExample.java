package p281final필드선언과초기화;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567","홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";			//nation 은 이미 상수 이기 때문에 오류남
//		p1.ssn = "654321-7654321";  //ssn 또한 이미 상수 이기 때문에 오류남
		p1.name = "홍삼원";
		
	}

}
