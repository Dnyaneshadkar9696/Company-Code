
public class StarPatternTriangle {
	
	
	public static void main(String[] args) {
		
		// to print star pattern -  right triangle 
		for(int i = 1; i<=5 ; i++) {
			for(int j =1 ; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// Second number pattern
		System.out.println();
		for(int h= 1; h <= 5;h++) {
			for( int t = 1; t <=h; t++) {
				System.out.print(t);
			}
			System.out.println();
		}
		
		// reverse star pattern
		System.out.println();
		for(int m= 5; m >=1; m--) {
			for(int n= 1; n <=m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
