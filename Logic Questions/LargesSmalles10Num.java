import java.util.Scanner;
public class LargesSmalles10Num {
	
	public static void main(String[] args) {
		// to find the larges and the smallest num among the 10 numbers
		
		Scanner os = new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		// take the first num as referense
		System.out.println("Enter the first number for reference: ");
		int d = os.nextInt();
		int large = d;
		int small = d;
		System.out.println("Enter the nine numbers: ");
		for(int i = 1; i<= 10; i++) {
		
			int c = os.nextInt();
			if(c > large) {
				large = c;
			}
		    if(c< small) {
		    	  small = c;
		    }

	    }
		System.out.println("Large Number : "+ large);
		System.out.println("Small Number: "+ small);
	}

}
