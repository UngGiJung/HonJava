package p195for문으로배열복사;

public class sec02exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			
			//마지막 줄 ',' 없애주기 1단계
//			if (i < newIntArray.length - 1) {
//				System.out.print(newIntArray[i] + ", ");
//			} else {
//				System.out.print(newIntArray[i]);
//			}
			
			//마지막 줄 ',' 없애주기 2단계
			System.out.print(newIntArray[i]);
			if (i < newIntArray.length - 1) {
				System.out.print(", ");
			} else {
				
			}
		}
	}
}
