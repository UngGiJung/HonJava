package protected접근제한자예제;

public class B {
	public void method() {
		A a = new A();     // 접근 가능
		a.field = "value"; // 접근 가능
		a.method();        // 접근 가능
	}
}
