package 재정의할수없는final메소드예제;

public class Car {

	//필드
	public int speed;
	
	//생성자
	public void speedUp() { speed += 1; }
	
	//final메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
