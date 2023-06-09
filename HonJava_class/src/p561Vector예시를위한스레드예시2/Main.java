package p561Vector예시를위한스레드예시2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("똥");
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				
			}
		}
	}
}
