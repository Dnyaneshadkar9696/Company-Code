package ClassObjectMethod;

class Palindrome{
	
	public void checkPalindrome(int n) {
		int reverse = 0;
		int b = n;
		while(n > 0) {
			int digit = n%10;
			reverse = reverse * 10 + digit;
			n = n/10;
		}
		if(reverse == b ) {
			System.out.println("The number is palindrome");
			
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	}
}


public class PalindromeMethod {
	public static void main(String[] args) {
		Palindrome  sit = new Palindrome();
		sit.checkPalindrome(1211);
		sit.checkPalindrome(34443);
		sit.checkPalindrome(101);
	}

}
