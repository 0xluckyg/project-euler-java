package problem7;

public class Problem7 {
	public static void main(String[] args) {
		int i = 1;
		int prime = 0;
		
		while (i < 10001) {
			
			if (isPrime(prime) == true) {
				i ++;
				prime ++;
			} else {
				prime ++;
			}
		}
		
		System.out.println(prime - 1);
	}
	
	public static boolean isPrime(int isPrime) {
		
		boolean flag = false;
		
		for (int i = 2; i < isPrime; i++) {
			if (isPrime % i == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		
		return flag;
		
	}
}
