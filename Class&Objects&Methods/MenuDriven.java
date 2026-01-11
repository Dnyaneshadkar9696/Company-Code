package ClassObjectMethod;
import java.util.Scanner;
class MenuApp{
	// to perform addition substraction and multiplication and exit
	public void myMenu() {
		
	Scanner ud = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int b = ud.nextInt();
	int c = ud.nextInt();
	System.out.println("----------------------------");
	System.out.println();
	System.out.println("Press 1 for Addition");
	System.out.println("Press 2 for Substraction");
	System.out.println("Press 3 for Multiplication");
	System.out.println("Press 4 for Exit");
	System.out.println("----------------------------");
	int a = ud.nextInt();
	
	switch(a) {
	
	case 1:
		System.out.println("Addition is : "+ (b+c));
		break;
	case 2:
		System.out.println("Substraction is : "+ (a-b));
		break;
	case 3:
		System.out.println("Multiplication is : "+ (a*b));
		break;
	case 4:
		System.out.println("Exit: End of the Programm");
		break;
	default:
		System.out.println("Enter the right number , Run the program again");
	}
	
	
	}
}


public class MenuDriven {
	public static void main(String[] args) {
		MenuApp ft = new MenuApp();
		ft.myMenu();
	}

}
