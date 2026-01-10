import java.util.Scanner;
public class CalculatePositiNegariNum {
	
	public static void main(String[] args){
		
		// here we have to accept the 10 numbers and tell weather the number is positive of negative number
		Scanner uf = new Scanner(System.in);
		int count = 0;
		int countn = 0;
		int zero = 0;
		System.out.println("Enter the 10 numbers: ");
		for(int i = 1; i <= 10; i++) {
			int b = uf.nextInt();
			if(b>0) {
				count++;
			}
			else if( b < 0 ) {
				countn++;
			}
			else {
				zero++;
			}
		}
		System.out.println("Positive numbers: "+ count);
		System.out.println();
		System.out.println("Negative numbers: "+ countn);
		System.out.println();
		System.out.println("Total Zeros: "+zero);
		
		
		
		
		
		
		
		
	}

}
