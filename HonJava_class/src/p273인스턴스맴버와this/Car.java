package p273인스턴스맴버와this;

public class Car {
	// 필드(=맴버변수=속성)
	String model;
	int speed;

	// 생성자
	Car(String model) {
		this.model = model;
		this.speed = 0; // = setSpeed(0); = 스피드 값 초기화를 명시화함
	}

	// 메소드

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + " lm/h)");
		}
	}
}
