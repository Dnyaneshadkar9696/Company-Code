
public class FibionnachiSeries {
	
	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 .....
		
		int a= 0;
		int b = 1; 
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i = 1; i <= 50; i++) {
			int c = a + b;
			System.out.print(c+" ");
			a = b; 
			b = c;
		}
	}

}
