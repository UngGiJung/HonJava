package p69논리타입예제;

public class p69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		stop = !stop;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}

}
