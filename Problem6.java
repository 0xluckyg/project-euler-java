package problem6;

public class Problem6 {

	public static void main(String[] args) {
		
		System.out.println(Math.abs(squareType2(100) - squareType1(100)));
		
	}
	
	public static int squareType1(int number) {
		
		int total = 0;
		
		for (int i = 1; i <= number; i++) {
			total += i*i;
		}
		return total;
	}
	
	public static int squareType2(int number) {
		
		int total = 0;
	
		for (int i = 1; i <= number; i++) {
			total += i;
		}	
		return total*total;
	}
}
