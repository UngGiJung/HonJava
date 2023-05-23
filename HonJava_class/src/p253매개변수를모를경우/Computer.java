package p253매개변수를모를경우;

public class Computer {

	int sum1(int[] values) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	int sum2(int ...values ) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}