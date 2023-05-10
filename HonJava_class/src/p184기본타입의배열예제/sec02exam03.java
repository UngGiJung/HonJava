package p184기본타입의배열예제;

public class sec02exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
			
		}
		System.out.println();
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			arr1[i] = 10 * (i+1);
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
//		System.out.println();
//		for(int i=0; i<3; i++) {
//			for(int j = 1; j <= 1; j++) {
//				System.out.println("arr1[" + i + "] : "+((i+1)*10));
//			}
//		}
		System.out.println();
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println();
//		arr2[0] = 0.1;
//		arr2[1] = 0.2;
//		arr2[2] = 0.3; 
		for(int i=0; i<3; i++) {
			arr2[i] = 0.1 * i + 0.1;
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
			System.out.printf("arr2[" + i + "] : %.1f\n",arr2[i]);
//			System.out.printf("arr2[" + i + "] : %.1d\n",arr2[i]);
//			System.out.printf("arr2[%d] : %.1f\n",i,arr2[i]);

		}
		System.out.println();
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println();
//		arr3[0] = "1월";
//		arr3[1] = "2월";
//		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			arr3[i] = 1 * (i + 1) + "월";
			System.out.println("arr3[" + i + "] : " + arr3[i]);
	}

}
	
}
