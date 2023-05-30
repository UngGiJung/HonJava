package p378다중인터페이스구현예제;

public class SmartTelevisonExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(8);
//		rc.search("");
		rc.turnOff();
		
		Searchable searchable = tv;
//		serchable.setVolume(7);
//		serchable.search("www.google.com");
		
//		tv.rutnOn();
//		tv.setvolume(6);
		tv.search("www.naver.com");
		tv.turnOff();
	}
	
}
