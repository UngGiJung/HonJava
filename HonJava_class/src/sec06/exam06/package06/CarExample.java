package sec06.exam06.package06;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		
		//올바론 속도 벼경
		myCar.setSpeed(60);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) { // 'is'가 붙으면 boolean 값 참 거짓을 따짐
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
