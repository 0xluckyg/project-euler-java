package problem3;

public class Problem3 {
	public static void main(String[] args) {
		
		long set = 600851475143L;
		long max = 0;
				
		for (int i = 0; i < Math.sqrt(set); i++) {			
			if (prime(i) == true && set % i == 0) {
				if (i > max) {
					max = i;
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static boolean prime(int isPrime) {
		
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
