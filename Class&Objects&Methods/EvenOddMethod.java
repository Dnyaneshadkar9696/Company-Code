package ClassObjectMethod;
import java.util.Scanner;
class NumberCheck{
	
	public void isEven(int n) {
		if(n%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
	}
}

public class EvenOddMethod {
	
	public static void main(String[] args) {
		// to check the number is even or odd
		NumberCheck ds = new NumberCheck();
		ds.isEven(3);
	}

}
