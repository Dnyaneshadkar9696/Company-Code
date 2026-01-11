package ClassObjectMethod;

public class SumofDigitUntilSingleDigitRemain {
	
	public static void main(String[] args) {
		// to find the sum of the digit until the single digit remains
		
		int a = 123456;
		int b =a; 
		// first we count the count
		int count = 0;
		while (a > 0) {
			count++;
			a = a/10;
		}
		// i destroy the original number here 
		System.out.println(count);
		// now set condition according to the count
		int sum = 0;
		int total = 0;
		while(b > 10 ) {
			int digit = b% 10;
			sum = sum + digit;
			b = b/10;
		}
		System.out.println("The sum of digits is: "+ sum);
		
		
	}

}
