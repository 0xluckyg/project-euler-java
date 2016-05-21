package problem5;

public class Problem5 {
	public static void main(String[] args) {
		int i = 20;
		int finalNum;
		
		outerloop:
		while (true) {
			for (int a = 1; a <= 20; a++) {
				if (i % a != 0) {
					break;
				} 
				if (a == 20) {
					finalNum = i;
					break outerloop;
				}
			}
			i = i + 20;
		}
		System.out.println(finalNum);
	}
}
