package 상속자예제2사람;

public class Student extends People{
	public int studentNo;

	public Student() {
		System.out.println("Student()");
	}

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn, studentNo);
		this.studentNo = studentNo;
		System.out.println("Student - str, str, int");
	}
}
