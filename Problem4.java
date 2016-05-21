package problem4;

public class Problem4 {

	public static void main(String[] args) {
		
		int maxPal = 0;
		
		for (int a = 100; a < 1000; a++) {
			for (int b = 100; b < 1000; b++) {
				int palindrome = a * b;
				if (isPalindrome(palindrome) && palindrome > maxPal) {
					maxPal = palindrome;
				}
				
			}
		}
		
		System.out.println(maxPal);
	}
	
	public static boolean isPalindrome(int originalNumber) {
		
		boolean flag = true;
		String number = Integer.toString(originalNumber);
		
		if (number.length() % 2 == 0) {
			for (int a = 0; a < (number.length() / 2); a++) {
				int b = (number.length() - (a + 1));		

				if (number.charAt(a) != number.charAt(b)) {
					flag = false;
					break;
				} else {
					flag = true;
				}
				
			}			
		} else {
			flag = false;
		}
		return flag;
	}
}
