package p95read명령어사용법3;

public class sec04exam04 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		
		
		System.out.println("종료");
	}

}
