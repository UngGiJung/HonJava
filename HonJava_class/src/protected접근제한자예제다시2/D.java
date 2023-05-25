package protected접근제한자예제다시2;

import protected접근제한자예제.A;

public class D extends A {
	public D() {
		super();				// 접근 가능
		this.field = "value";   // 접근 가능
		this.method();          // 접근 가능
	}
}
