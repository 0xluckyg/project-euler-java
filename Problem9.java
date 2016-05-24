package problem9;

public class Problem9 {
	
	public static void main(String[] args) {
		
		int pythFinal = 0;	
		
		for (int a = 1; a <= 1000; a++) {
			for (int b = 1; b <= 1000; b++) {
				int pyth = (int) (Math.pow(a, 2) + Math.pow(b, 2));
				if (isPerfectSquare(pyth) == true) {
					if (Math.sqrt(pyth) + a + b == 1000) {
						pythFinal = (int) (a * b * Math.sqrt(pyth));
					}
				}
			}
		}
		
		System.out.println(pythFinal);
	}
	
	public static boolean isPerfectSquare(long number) {
		if (number < 0) {
			return false;
		}
		long sqrtNum = (long)(Math.sqrt(number) + 0.5);
		return Math.pow(sqrtNum, 2) == number;
	}
	
}
