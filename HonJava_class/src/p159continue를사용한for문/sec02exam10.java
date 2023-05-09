package p159continue를사용한for문;

public class sec02exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
//          if(i % 2 == 0) 홀수만 남길때
			if(i % 2 != 0) {
				continue;
//               break;
			}
			System.out.println(i);
		}
	}
}
