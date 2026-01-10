import java.util.Scanner;
public class VowelInString {
	public static void main(String[] args) {
		// to count the vowels in the string 
		Scanner sis = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String nd = sis.nextLine();
		int count = 0;
		for(int i = 0; i < nd.length(); i++) {
			char ch = nd.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || 
	                ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || 
	                ch == 'O' || ch == 'U') {
				
				count++;
			}
		
					
		}
		System.out.println("Vowels in the String are: "+ count);
	}

}
