package p136if문삼항연산자로변경;

public class sec01exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		
		String a = score>=90 ? "점수가 90보다 큽니다.\n등급은 A입니다." : "점수가 90보다 작습니다.\n등급은 B입니다.";
		System.out.println(a);
	}

}
