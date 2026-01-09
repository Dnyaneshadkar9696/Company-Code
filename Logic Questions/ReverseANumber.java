import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args) {
    	   // here we have to reverse the number given 
    	   
    	   Scanner sd = new Scanner(System.in);
    	   System.out.println("Enter the number : ");
    	   int a = sd.nextInt();
    	   int reverse = 0;
    	   while(a > 0) {
    		   int digit = a%10;
    		   reverse = reverse *10 + digit;
    		   
    		   a = a/10;
    	   }
    	   System.out.println("Reverse number is: "+ reverse);
    	   
    	   
    	   
    }
}
