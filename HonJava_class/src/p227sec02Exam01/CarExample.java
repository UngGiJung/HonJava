package p227sec02Exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도:" +myCar.speed);

		
		System.out.println();
		
		
		//내 꿈의카 새롭게 생성하기
		Car genesis = new Car();
		genesis.model = "g80";
		genesis.color = "빨강";
		genesis.maxSpeed = 400;
		genesis.speed = 120;
		
		System.out.println("제작회사: " + genesis.company);
		System.out.println("모델명: " + genesis.model);
		System.out.println("색깔: " + genesis.color);
		System.out.println("최고속도: " + genesis.maxSpeed);
		System.out.println("현재속도: " + genesis.speed);
		
		genesis.speed = 100;
		System.out.println("수정된 속도:" +genesis.speed);
		
	}

}
