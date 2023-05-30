package p394인터페이스객체타입확인;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금으 체크합니다.");
	}
	
}

