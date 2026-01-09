
public class EvenNum1toN {
	
	public static void main(String[] args) {
		// to print even numbers between 1 to n
		
		for(int i = 1; i <= 100 ; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
	}

}
