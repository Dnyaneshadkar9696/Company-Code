package ClassObjectMethod;


class Factorial{
		
	public void findFactorial(int n) {
		// using for loop find the factorial 
		int sum = 1;
		for(int i = n ; i >=1 ;i--) {
			sum = sum * i;
		}
		System.out.println("Factorial of the number is: "+sum);
	}
}



public class FactorialMethod {
	
	public static void main(String[] args) {
		Factorial sof = new Factorial();
		sof.findFactorial(6);
	}

}
