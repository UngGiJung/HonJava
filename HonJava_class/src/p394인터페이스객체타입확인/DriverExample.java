package p394인터페이스객체타입확인;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi);
		driver.drive(bus);
		
		System.out.println();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
