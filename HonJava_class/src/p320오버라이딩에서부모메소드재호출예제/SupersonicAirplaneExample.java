package p320오버라이딩에서부모메소드재호출예제;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane(); {
			sa.takeoff();
			sa.fly();
			sa.flyMode = SupersonicAirplane.SUPERSONIC;
			sa.fly();
			sa.flyMode = SupersonicAirplane.NORMAL;
			sa.fly();
			sa.land();
		}
	}

}
