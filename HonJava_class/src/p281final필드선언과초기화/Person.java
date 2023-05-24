package p281final필드선언과초기화;

public class Person {
	final String nation = "korea"; // 맴버 상수 (맴버 변수X)
	final String ssn;				// 맴버 상수 (맴버 변수X)
		// 변수 = 변동되는 값 , 상수 = 변동되지 않는 값 (고정값)
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}	
}
