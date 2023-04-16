package assignment;
import java.util.Scanner;
public interface CheckBal {
void deposit();
void withdraw();
}

class ICICI implements CheckBal{

	int balance=0;
	
	@Override
	public void deposit() {
		System.out.println("Enter the amount to be Deposited");
		Scanner sc = new Scanner(System.in);
		int deposite= sc.nextInt();
		balance += deposite;
		System.out.println("Total Balance: "+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount to withdraw");
		Scanner s = new Scanner(System.in);
		int withdraw = s.nextInt();
		if(balance <= withdraw) {
			balance -= withdraw;
			System.out.println("Total Balance after Withdrawel"+balance);
		}
		else {
			throw new InsufficientFundException("OOp's ur Poper");
		}
		
	}
	
}

class SBI implements CheckBal{

	int balance=10000;
	@Override
	public void deposit() {
		System.out.println("Enter the amount to be Deposited");
		Scanner sc = new Scanner(System.in);
		int deposite= sc.nextInt();
		balance+= deposite;
		System.out.println("Total Balance: "+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount to Withdraw");
		Scanner s = new Scanner(System.in);
		int withdraw = s.nextInt();
		if(balance <= withdraw) {
			throw new InsufficientFundException("OOp's ur Poper");
		}
		else {
		
			balance-=withdraw;
			System.out.println("Total Balance after Withdrawel="+balance);
		}
		
	}
	
}

