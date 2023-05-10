package p186배열의length필드;

public class sec02exam04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("총괄 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		System.out.println("=================");
		
		String[] str = new String[3];
		str[0] = "A";
//		str[1] = "B";
		str[2] = "C";
		
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
}
