package p320오버라이딩에서부모메소드재호출예제;

public class SuperSupersonicAireplane extends SupersonicAirplane {
	   public static final int SUPERSUPERSONIC = 3;

	   public void fly() {
	      if (flyMode == SUPERSUPERSONIC) {
	         System.out.println("초초음속비행합니다.");
	      } else {
	         super.fly();
	      }
	   }
	}
