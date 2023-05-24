package p280싱글톤예제;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton( ) {}
	
	static Singleton getinstance() {
		return singleton;
	}
	
	
}
