package p395인터페이스강제타입변환예제;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금으 체크합니다.");
	}
	
}

