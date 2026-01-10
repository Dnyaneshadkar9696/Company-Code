import java.util.Scanner;
public class ArmstrongNumber {

	
	public static void main(String[] args) {
		// to print the armstrong number
		Scanner id = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int x = id.nextInt();
		int s = x;
		int e1 = x;
		int e2 = x; 
		int count = 0;
		// we have to calculate the count of the number 
		while( e1 > 0 ) {
			count++;
			e1 = e1/10;
			// using this loop we got count
		}
		
		// another loop to do the calculation
		int total = 0;
		while(e2 > 0) {
			int digit = e2%10;
			// suppose i got 3 and i want to cube of it
			int i = 1;
			int sum = 1;
			while(i <= count) {
				sum = sum * digit;
				// it will do three times 3 * 3 * 3 and store it into sum
				i++;
			}
			total = total + sum;
			e2 = e2/10; // decreasing the number
		}
		
		if(s == total) {
			System.out.println("It is a Armstrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong number");
		}
		
	}
}
