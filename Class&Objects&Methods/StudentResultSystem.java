package ClassObjectMethod;
import java.util.Scanner;

class Student{
	
	
	int marks = 0;
	
	public void checkResult() {
		
		Scanner id = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		marks = id.nextInt();
		if(marks > 35) {
			System.out.println("You are PASS");
		}
		else {
			System.out.println("You are FAIL");
		}
	}
}




public class StudentResultSystem {
	
	// student result system 
	public static void main(String[] args) {
		
		Student ud = new Student();
		ud.checkResult();
	}

}
