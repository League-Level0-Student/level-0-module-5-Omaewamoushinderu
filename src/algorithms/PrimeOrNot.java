package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String y = JOptionPane.showInputDialog("What number would you like to check if it is a prime number?");
		int x = Integer.parseInt(y);
		boolean isprime = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {

				isprime = false;

			}
			
			
		}
		
		if (isprime) {

			isprime = false;
			JOptionPane.showMessageDialog(null, "Your number is a prime");
		}
		else {
			JOptionPane.showMessageDialog(null , "Your number isnt a prime");
		}
			
	}
}
