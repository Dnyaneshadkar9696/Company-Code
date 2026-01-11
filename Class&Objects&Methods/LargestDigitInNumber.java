package ClassObjectMethod;
import java.util.Scanner;
public class LargestDigitInNumber {
	
	public static void main(String[] args) {
		// to find the largest digit in the nunber 
		Scanner ie = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String sf = ie.nextLine();
		char ch = sf.charAt(0);
		char t1 = ch;
		char t2 = ch;
		for(int i = 0; i < sf.length(); i++) {
			 ch = sf.charAt(i);
			 
			 if(ch > t1) {
				 t1 = ch;
			 }
			 if(ch < t2) {
				 t2 = ch;
			 }
			
		}
		System.out.println("Largest: "+ t1);
		System.out.println("Smallest: "+ t2);
	}

}
