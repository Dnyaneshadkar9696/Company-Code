package ClassObjectMethod;

class Armstrong{
	
	public void isArmstron(int n) {
		// first we need to count th count 
		int e1 = n;
		int e2 = n;
		int count = 0;
		while ( n > 0) {
			count++;
			n = n/10;
		}
		
		// now we need to do the calculation 
		int total = 0;
		while( e1 > 0) {
			// we need the last number an multiply the number as per the count times 
			
			int digit = e1%10;
			int i = 1; 
			int sum = 1;
			
			while ( i <= count ) {
				sum = sum * digit;
				i++;
			}
			total = total + sum;
			
			e1 = e1/10;
		}
		if( total == e2) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong number ");
		}
		
		
		
		
	}
}




public class ArmstronMethod {
	
	public static void main(String[] args) {
		Armstrong suf = new Armstrong();
		suf.isArmstron(153);
		suf.isArmstron(567);
		
	}

}
