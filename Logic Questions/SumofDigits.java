
public class SumofDigits {
	
	public static void main(String[] args) {
		// to find the sum of the digits
		
		int a = 44444444;
		int sum = 0;
		// we dont have starting and ending so we use while loop 
		 while(a > 0) {
			 int digit = a%10;
			 // it will give me the unit place digit
			 sum = sum + digit;
			 // then reduce the number
			 a = a/10;
		 }
		 System.out.println("Sum of the number is: "+ sum);
		
	}

}
