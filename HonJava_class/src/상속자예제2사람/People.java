package 상속자예제2사람;
//교제 p315 상속 예제 
public class People {
	public String name;
	public String ssn;

	public People() {
		System.out.println("People()");
	}

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public People(String name, String ssn, int i) {
		System.out.println("People - str, str, int");
		this.name = name;
		this.ssn = ssn;
	}
}
