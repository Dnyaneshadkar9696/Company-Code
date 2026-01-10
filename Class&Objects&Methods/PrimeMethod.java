package ClassObjectMethod;


class PrimeCheck{
	int temp =0; 
	public void isPrime(int n) {
			for(int i = 2; i < n ; i++) {
				if( n% i ==0) {
					temp = temp + 1;
					break;
				}
				
			}
			if(temp == 0) {
				System.out.println("The number is a Prime Number");
			}
			else {
				System.out.println("The number is not a Prime Number ");
			}
	}
	 
}
public class PrimeMethod {
	public static void main(String[] args) {
		
		PrimeCheck  sfsa = new PrimeCheck();
		sfsa.isPrime(75);
		sfsa.isPrime(45); // can check for multiple numbers we can add Scanner class here 
		
	}

}
