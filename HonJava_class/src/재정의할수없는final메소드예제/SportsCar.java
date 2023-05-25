package 재정의할수없는final메소드예제;

public class SportsCar extends Car {
	@Override
	public void speedUp() { speed += 10; }
	
	@Override
	public void stop() {//final 메소드로 인해 오버라이딩이 불가능함
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
