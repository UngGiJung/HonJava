package p393인터페이스타입변환과다향성예제2;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		//Vehicle vehicle = bus;
		//Vehicle vehicle = taxi;
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
