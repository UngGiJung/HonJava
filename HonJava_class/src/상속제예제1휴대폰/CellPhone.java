package 상속제예제1휴대폰;

public class CellPhone {
	//교제 p312 상속 예제
	
	//필드
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() { System.out.println("전원을 켭니다."); }
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println("자기: " + message); }
	void receiveVoice(String message) { System.out.println("상대방: "+message); }
	void hangUp() { System.out.println("전화를 끊습니다."); }
}
	

