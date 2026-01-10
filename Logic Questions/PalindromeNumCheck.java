import java.util.Scanner;
public class PalindromeNumCheck {
	
	public static void main(String[] args) {
		// to check weather the number is a palindrom or not 
		
		Scanner sf = new Scanner(System.in);
		System.out.println("Enter the positive number: ");
		int d = sf.nextInt();
		int reverse = 0;
		int x = d;
		
		while(d > 0) {
			int digit = d%10;
			reverse = reverse * 10 + digit;
			d = d/10;
		}
		if(reverse == x) {
			System.out.println("It is a Palindrome number");
		}
		else {
			System.out.println("It is not a palindrome number");
		}
		
		
//		byte    1 byte    8 bits
//		short   2 byte    16 bits
//		integer 4 byte    32 bits
//		float   4 byte    32 bits
//		double  8 byte    64 bits
//		long    8 byte    64 bits
//		char    2 byte    16 bits
//		boolean  not defined
		
	}

}
