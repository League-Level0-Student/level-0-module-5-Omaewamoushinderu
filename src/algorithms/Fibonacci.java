package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int last = 0;
		int secondlast = 1; 
		for (int i =0; i < 12; i++) {
			
			System.out.println(last + secondlast);
			// start with 0 and 1
			// the sum of the previous 2 numbers
			// then add that sum with the previous number
			// do it 12 more times
		}
	}
}
