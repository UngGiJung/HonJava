package p562LinkdeList예시;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		long timeStart;
		long timeEnd;
		
		timeStart = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(i, String.valueOf(i));
		}
		
		timeEnd = System.nanoTime();
		System.out.printf("ArrayList  걸린 시간 : %9dns\n",(timeEnd - timeStart));
		
		timeStart = System.nanoTime();
		for (int i =0; i < 10000; i++) {
			list2.add(i, String.valueOf(i));
		}
		timeEnd = System.nanoTime();
		System.out.printf("Linkedlist 걸린 시간 : %9dns\n",(timeEnd - timeStart));
	}

}
