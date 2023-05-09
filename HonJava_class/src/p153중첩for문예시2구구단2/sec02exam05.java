package p153중첩for문예시2구구단2;

public class sec02exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5~7단까지 출력
//		for (int m = 5; m<=7; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n=2; n<=9; n++) {
//				System.out.println(m + "x" + n + " = " + (m*n));
		
		
		 // 3~4단까지 출력, 각 구구단 5,6,7까지 출력
		for (int m = 3; m<=4; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n=5; n<=7; n++) {
				System.out.println(m + "x" + n + " = " + (m*n));

		
		
		
		
			}
		}
	}

}
