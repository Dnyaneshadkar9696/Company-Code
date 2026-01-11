package ClassObjectMethod;
import java.util.Scanner;

class BankAccount{
	int depo = 0;

	int balance = 0;
	int withdr = 0;
	
	Scanner fs = new Scanner(System.in);
	
	public void running() {
		System.out.println("Enter your choise: ");
		int a = fs.nextInt();
	}
	
	public void genralInfo() {
		String myName;
		int myMob;
		String myMail;
		System.out.println();
		System.out.println("       Genral Informatioin     ");
		myName = "Dnyanesh Adkar";
		myMob = 245927423;
		myMail = "dnyadf@gmail.com";
		System.out.println("Name: "+myName);
		System.out.println("Mobile No: "+ myMob);
		System.out.println("Email: "+ myMail);
		

	}
	
	public void balanceCheck() {
		System.out.println("The balance is: "+ balance);
	}
	

	public void deposit() {
		int depo1 = 0;
		System.out.println("Enter amount to deposit: ");
		depo1 = fs.nextInt();
		depo = depo + depo1;
		System.out.println("Your amount is deposited successfully");
		balance = balance + depo;
		
		
	}
	public void withdraw() {
		int withdr1 = 0;
		System.out.println("Enter the amount to withdraw: ");
		withdr1 = fs.nextInt();
		if(depo < withdr1) {
			System.out.println("Insufficient Balance");
		}
		else {
			depo = balance - withdr1;
			System.out.println("Withdraw successfull");
			System.out.println("Remaining balance is: "+ depo);
			balance = depo;
		}
		
	}
}


public class Bank {
	public static void main(String[] args) {
		
		BankAccount cfd = new BankAccount();
		Scanner sc = new Scanner(System.in);
		BankAccount os = new BankAccount();
		int x = 0;
		
		do {
			System.out.println();
			System.out.println("------------------------------------------");
		System.out.println("         Welcome to India Bank  ");
		System.out.println("Select the action you want to perform: ");
		System.out.println("1 . To check the balance");
		System.out.println("2 . To deposite the money");
		System.out.println("3 . To withdraw the money");
		System.out.println("4 . To check general informatioin");
		System.out.println("5 . To exit");
		System.out.println();
		System.out.println("Please Enter your choise: ");
		x = sc.nextInt();
		switch(x) {
		case 1:
			cfd.balanceCheck();
			break;
		case 2:
			cfd.deposit();
			break;
		case 3:
			cfd.withdraw();
			break;
		case 4:
			cfd.genralInfo();
			break;
		case 5:
			System.out.println("End of the programm");
			break;
		default:
			System.out.println("Enter the accurate number");
		}
		
		}while(x !=5);
		
		sc.close();
		
	}

}
