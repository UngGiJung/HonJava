package p363추상메소드선언예제;

public abstract class Animal {
	public String kind;
	
	public void breathe( ) {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
