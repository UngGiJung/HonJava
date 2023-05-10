package p184String타입의null초기화;

public class p184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
//		str += "ttt";
		str += 3;
		System.out.println(str);
		
		//'null'은 초기화 값으로 선언한 것이지만, 문자열로 인식하여 출력되는것이 신기한 포인트임
	}

}
