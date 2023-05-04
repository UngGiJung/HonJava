package p96Scanner사용법;

import java.util.Scanner;

public class sec04exam05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		
		scanner.close();
		System.out.println("종료");
	}

}
