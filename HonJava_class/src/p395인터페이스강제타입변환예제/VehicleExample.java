package p395인터페이스강제타입변환예제;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFara(); // Vehicle 인터페이스에는 checkFara()가 없음
		
		Bus bus = (Bus) vehicle; // 강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}
}
