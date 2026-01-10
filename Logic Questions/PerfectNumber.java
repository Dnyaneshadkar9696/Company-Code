import java.util.Scanner;
public class PerfectNumber {
	
	public static void main(String[] args) {
		// we see weather the number is perfect or not 
	    // ex = 6 and its factors is 1 2 3 and sum of those factors is 6 so it is a perfect number 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int c = a;
        int sum = 0;
		for(int i = 1; i < a; i++) {
			if(a%i == 0) {
				// then it is factor of 6
				sum = sum + i;
			}
		}
		if(c == sum) {
			System.out.println("It is a Perfect Number");
		}else {
			System.out.println("It is not a Perfect Number");
		}
	}

}
