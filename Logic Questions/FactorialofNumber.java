
public class FactorialofNumber {
	public static void main(String[] args) {
		// to find the factorial of a number 
		// difference between factorial and factors
		int a = 3;
		int sum = 1;
		// factorial is 5 * 4 * 3* 2* 1
		// and factors is the number provided is divisible by how many numbers
		while(a !=0) {
			sum = sum * a;
			a--;
		}
		System.out.println("Answer - " + sum);
	}

}
