package p336자동타입변환예제2;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //자동 타입 변환
		parent.method1();      
		parent.method2();	   //재정의된 메소드가 호출됨
		//parnet.method3();    //자동 타입 변환이 부모타입인 'Parent'를 주시하기 때문에 'Child'에 있는 메소드인 '3'은 호출 불가능
		
	}
}
