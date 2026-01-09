
public class PrimeNumCheck {
	
	public static void main(String[] args) {
		// to check given number is prime or not 
		
		// prime number is the number which is divisible by 1 and itself
		
		int a = 3;
		
		for(int i = 2; i < a; i++) {
			if(a%i == 0) {
				System.out.println("The number is not a prime number");
				break;
			}
			else {
				System.out.println("The number is a prime number");
				break;
			}
		}
	}

}
