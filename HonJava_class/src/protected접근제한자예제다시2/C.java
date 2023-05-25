package protected접근제한자예제다시2;

import protected접근제한자예제.A;

public class C {
	public void method() {
		A a = new A();     // 접근 불가능
		a.field = "value"; // 접근 불가능
		a.method();		   // 접근 불가능	
	}
}
