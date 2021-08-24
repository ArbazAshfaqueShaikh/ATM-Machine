import java.lang.*;
import java.util.*;

class ChAccount {
		int CusNum, Pin, choice1, choice2, ChAccBal, SvAccBal, ChWid, ChDep,SvWid, SvDep;
		int i,j,k;
	public void Details() {
		for(i = 0;i<50;i++) {
			try {
		System.out.println("Checking Account:\nType 1 - View Balance\nType 2 - Withdraw Funds\nType 3 - Deposit Funds\nType 4 - Exit");
		Scanner n2 = new Scanner(System.in);
		choice2 = n2.nextInt();
		
		if(choice2 == 1) {
			System.out.println("Checking Account Balance: $ " + ChAccBal);
			
		}
		else if(choice2 == 2) {
			System.out.print("Withdraw Amount: ");
			ChWid = n2.nextInt();
			
			if(ChAccBal >= ChWid) {
				ChAccBal = ChAccBal - ChWid;
				System.out.println(ChWid+" is withdrawn");
				System.out.println("Checking Account Balance: $ " + ChAccBal);
			}
		
			else {
				System.out.println("Insufficiant Balance");
			}
		}
		else if(choice2 == 3) {
			System.out.println("Checking Account Balance: $ " + ChAccBal);
			System.out.print("Deposit Amount: ");
			ChDep = n2.nextInt();
		
			ChAccBal = ChAccBal + ChDep;
			System.out.println("Checking Account Balance: $ " + ChAccBal);
		}
		else if(choice2 == 4) {
			break;
		}
		else {
			System.out.println("Invalid Choice");
		}
		}
		catch(Exception e) {
			System.out.println("You enter invalid character");
		}
		}
	
	}
}
class SvAccount {
		int CusNum, Pin, choice1, choice2, ChAccBal, SvAccBal, ChWid, ChDep,SvWid, SvDep;
		int i,j,k;
	public void Details() {
		for(i = 0;i< 50; i++) {
			try {
		System.out.println("Saving Account:\nType 1 - View Balance\nType 2 - Withdraw Funds\nType 3 - Deposit Funds\nType 4 - Exit");
		Scanner n3 = new Scanner(System.in);
		choice2 = n3.nextInt();

		if(choice2 == 1) {
			System.out.println("Saving Account Balance: $ "+ SvAccBal);
		}
		else if(choice2 == 2) {
			System.out.print("Withdraw Amount: ");
			SvWid = n3.nextInt();
			
			if(SvAccBal >= SvWid) {
				SvAccBal = SvAccBal - SvWid;
				System.out.println(SvWid+" is withdrawn");
				System.out.println("Checking Account Balance: $ " + SvAccBal);
			}
			else {
				System.out.println("Insufficiant Balance");
		}
		}
		else if(choice2 == 3) {
			System.out.println("Checking Account Balance: $ " + SvAccBal);
			System.out.print("Deposit Amount: ");
			SvDep = n3.nextInt();
	
			SvAccBal = SvAccBal + SvDep;
			System.out.println("Checking Account Balance: $ " + SvAccBal);
		}
		else if(choice2 == 4) {
			break;
		}
		else {
			System.out.println("Invalid Choice");
		}
		}
		catch(Exception e) {
			System.out.println("You enter invalid character");
		}
		}
	}
}
class Atm {
	public static void main(String[] args) {
		int CusNum = 9876543, Pin = 1234, choice1, choice2, ChAccBal = 0, SvAccBal = 0, ChWid, ChDep,SvWid, SvDep;
		int i,j,k;
		int CusNum0,Pin0;
		System.out.println("Welcome to the ATM Project");
		for(k = 0;k<50;k++) {
			try{
		System.out.print("Enter Your Customer Number: ");
		Scanner n1 = new Scanner(System.in);
		CusNum0 = n1.nextInt();
		
		System.out.print("Enter Your Pin Number: ");

		Pin0 = n1.nextInt();
		
		if(CusNum0 == CusNum && Pin0 == Pin) {
		
		}
		else {
			System.out.println("Invalid Customer Number Or Pin");
			continue;
		}
		ChAccount a = new ChAccount();
		SvAccount b = new SvAccount();
		a.ChAccBal = 0;
		b.SvAccBal = 0;
		Scanner n4 = new Scanner(System.in);
		for(j = 0;j<50;j++) {
		System.out.println("Select the Account you want to access: \nType 1 - Checking Account\nType 2 - Saving Account\nType 3 - Exit");

	   choice1 = n4.nextInt();
	   
		
			if(choice1 == 1) {
				a.Details();
		}
			else if(choice1 == 2) {
				b.Details();
		}
			else if(choice1 == 3) {
				System.out.println("Thank You For Visiting ATM");
				return;
		}
			else {
			System.out.println("Invalid Choice");	
		}
		}
			}
		catch(Exception e) {
			System.out.println("You enter invalid character");
		}
		
		}
		
	}
}
