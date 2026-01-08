
public class DigitInaNumber {
	
	public static void main(String[] args) {
		// count the digits in the number
		int a = 92342340;
		int count = 0; 
		while(a != 0) {
			// condition in the loop means run the loop until a = 0;
			int digit  = a% 10; // it gives the last or unit place number 
		    count++;
			
			a = a/10; // this will reduce the value of a by one number
		}
		System.out.println("Total Numbers: "+ count);
	}

}
