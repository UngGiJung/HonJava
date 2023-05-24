package p280싱글톤예제;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Singleton onj1 = new Singleton(); //컴파일 에러
		Singleton onj2 = new Singleton(); //컴파일 에러
		
		
		Singleton obj1 = Singleton.getinstance();
		Singleton obj2 = Singleton.getinstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
