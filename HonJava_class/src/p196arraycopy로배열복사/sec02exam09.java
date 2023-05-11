package p196arraycopy로배열복사;

public class sec02exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		//arraycopy 함수를 활용한 배열 복사
//		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);
						// 복사할 시작점   / 붙여넣을 시작점  / 복사할 곳의 길이 설정

		//for 반복문을 활용한 배열 복사
		for ( int i = 0; i < oldStrArray.length; i++ ) {
			newStrArray[i+2] = oldStrArray[i];
		}
				
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}	
	}
}
