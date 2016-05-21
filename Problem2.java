package problem2;

public class Problem2 {
	public static void main(String[] args) {
		long fib1 = 1;
		long fib2 = 2;
		long fib3 = 0;
		long total = 0;

		while (total < 4000000) {
			fib3 = fib1 + fib2;
		
			if (fib1 < fib2) {
				fib1 = fib3;
			} else {
				fib2 = fib3;
			}
			
			if (fib3 % 2 == 0) {			
				total = total + fib3;
			}
			
			fib3 = 0;
		}

		System.out.println(total + 2);

	}
}
