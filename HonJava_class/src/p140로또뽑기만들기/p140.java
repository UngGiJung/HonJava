package p140로또뽑기만들기;

public class p140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = (int) (Math.random() * 45) + 1;
//		int x1 = (int) (Math.random() * 45) + 1;
//		int x2 = (int) (Math.random() * 45) + 1;
//		int x3 = (int) (Math.random() * 45) + 1;
//		int x4 = (int) (Math.random() * 45) + 1;
//		int x5 = (int) (Math.random() * 45) + 1;
//
//		if (x == x1 || x == x2 || x == x3 || x == x4 || x == x5) {
//			++x;
//			--x1;
//			++x2;
//			--x3;
//			++x4;
//			--x5;
//		} else if (x1 == x || x1 == x2 || x1 == x3 || x1 == x4 || x1 == x5) {
//			++x;
//			--x1;
//			++x2;
//			--x3;
//			++x4;
//			--x5;
//		} else if (x2 == x1 || x2 == x || x2 == x3 || x2 == x4 || x2 == x5) {
//			++x;
//			--x1;
//			++x2;
//			--x3;
//			++x4;
//			--x5;
//		} else if (x3 == x1 || x3 == x2 || x3 == x || x3 == x4 || x3 == x5) {
//			++x;
//			--x1;
//			++x2;
//			--x3;
//			++x4;
//			--x5;
//		} else if (x4 == x1 || x4 == x2 || x4 == x3 || x4 == x || x4 == x5) {
//			++x;
//			--x1;
//			++x2;
//			--x3;
//			++x4;
//			--x5;
//		} else if (x5 == x1 || x5 == x2 || x5 == x3 || x5 == x4 || x5 == x) {
//			++x;
//			--x1;
//			++x2;
//			--x3;
//			++x4;
//			--x5;
//		} 
//		System.out.print(x + " ");
//		System.out.print(x1 + " ");
//		System.out.print(x2 + " ");
//		System.out.print(x3 + " ");
//		System.out.print(x4 + " ");
//		System.out.print(x5 + " ");
//	}
//
//}
		
		
		
		//강사님 풀이
		
		
		
		boolean f = false;
//		int num1, num2, num3, num4, num5, num6;
		int[] num = new int[6];
		do {
			f = false;
			// 1. 6개의 난수 추출
//			int num1 = 1, num2 = 2, num3 = 1, num4 = 4, num5 = 5, num6 = 6;
//			num1 = (int) (Math.random() * 45) + 1;
//			num2 = (int) (Math.random() * 45) + 1;
//			num3 = (int) (Math.random() * 45) + 1;
//			num4 = (int) (Math.random() * 45) + 1;
//			num5 = (int) (Math.random() * 45) + 1;
//			num6 = (int) (Math.random() * 45) + 1;
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 45) + 1;
			}

//			System.out.print(num1 + " ");
//			System.out.print(num2 + " ");
//			System.out.print(num3 + " ");
//			System.out.print(num4 + " ");
//			System.out.print(num5 + " ");
//			System.out.println(num6);
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();

//			if (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6) { // 1st
//				f = true;
//			} else if (num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6) { // 2nd
//				f = true;
//			} else if (num3 == num4 || num3 == num5 || num3 == num6) { // 3rd
//				f = true;
//			} else if (num4 == num5 || num4 == num6) { // 4th
//				f = true;
//			} else if (num5 == num6) { // 5th
//				f = true;
//			}
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if (i != j && num[i] == num[j]) {
						f = true;
					}
				}
			}
		} while (f);
	}
}

////우철이 풀이방법
//
//int[] lotto = new int[7];
//
//for (int i = 0; i < lotto.length; i++) { // 배열에 무작위 숫자를 넣는 코드
//   lotto[i] = (int)(Math.random() * 45) + 1;
//   
//   for (int j = 0; j < i; j++) { // 중복된 숫자를 생기면 그 숫자를 다시 배정 받는 코드
//      if(lotto[i] == lotto[j]) {
//         i--;
//      }
//   }
//}
//for (int i = 0; i < lotto.length-1; i++) { // 보너스 번호를 제외한 6 숫자를 오름차순으로 정렬하는 코드
//   for (int j = 0; j < i; j++) {
//      if(lotto[i] < lotto[j]) {
//         int temp = lotto[i];
//         lotto[i] = lotto[j];
//         lotto[j] = temp;
//      }
//   }
//}
//
//System.out.println("2023회 당첨결과");
//for (int i = 0; i < lotto.length-1; i++) {
//   System.out.print(lotto[i] + " ");
//}
//int bonus = lotto[lotto.length-1];
//System.out.print("+ 보너스 " + bonus);
//}
//}
