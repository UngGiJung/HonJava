package p360추상클래스예제;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Phone phone = new Phone(); // abstract 클래스 선언 키워드 떄문에 새로운 인스텐스를 만들수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
