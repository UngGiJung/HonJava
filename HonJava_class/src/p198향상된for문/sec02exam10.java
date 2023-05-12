package p198향상된for문;

public class sec02exam10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 95, 17, 84, 93, 87 };
		
		//향상된 for문 작성법
		int sum = 0;
		for (int score : scores ) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
//	}
//}
		System.out.println();
		
		//일반 for문 작성법
		int sum1 = 0;
		for ( int i = 0; i <= scores.length-1; i++ ) {
			sum1 += scores[i];
		}
		System.out.println("점수 총합 = " + sum1);
		
		double avg1 = (double) sum1 / scores.length;
		System.out.println("점수 평균 = "+avg1);
		
		
		//홀수번째 학생 점수의 합 = 일반 for문을 쓰기 편안한 상황
		for (int i = 0; i < scores.length; i += 2) {
			System.out.print(+scores[i] + " ");
		}
	}
}
