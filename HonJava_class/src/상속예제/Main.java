package 상속예제;

public class Main {
	public static void main(String[] args) {
		A ins1 = new A();
		System.out.println("A --");
		ins1.print();

		B ins2 = new B();
		System.out.println("B --");
		ins2.print();
		ins2.print2();
	}

}