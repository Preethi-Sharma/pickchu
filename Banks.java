package assignment;
import java.util.Scanner;
public class Banks
{
	static ICICI i=new ICICI();
	static	SBI sb= new SBI();
	 
public static void last()
{
	Banks b=new Banks();
	Scanner scc = new Scanner(System.in);
	System.out.println("Press 1 to continue ");
	System.out.println("Press 0 to Exit ");
	int chh= scc.nextInt();
	switch(chh) {
	case 0: System.exit(0);
		System.out.println("Thank you!! Have a nice day");
	case 1: b.banks();	
	break;
	}
}
	
public static void msg()
{
	System.out.println("Enter the Option for the transactions");
	System.out.println("1. Deposit Amount");
	System.out.println("2. Withdraw Amount");	
	Scanner scc= new Scanner(System.in);
	int ch= scc.nextInt();

	switch(ch){
	case 1: Banks.i.deposit();
	 	
     break;
	case 2: Banks.i.withdraw();
	 break;
	default: throw new InvalidInputException("Invalid input.");
	}
}
public static void msg2()
{
	System.out.println("Enter the Option for the transactions");
	System.out.println("1. Deposit Amount");
	System.out.println("2. Withdraw Amount");	
	Scanner scc= new Scanner(System.in);
	int ch= scc.nextInt();

	switch(ch){
	case 1: Banks.sb.deposit();
     break;
	case 2: Banks.sb.withdraw();
	 break;
	default: throw new InvalidInputException("Invalid input.");
	}
}
		public void banks()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Select the Bank you need to Proced the transaction:");
			System.out.println("0. To Exit");
			System.out.println("1. ICICI Bank");
			System.out.println("2. SBI Bank");
			int count = 0;
			while(count< 3)
			{
				int opt = sc.nextInt();
				switch(opt) 
				{
				case 0: System.exit(0);
				case 1: msg();
						last();
						break;
				
				case 2: msg2();
						last();
						break;
				default: count++;
				if(count == 2) {
					System.out.println("This is your last chance Enter the right input ");
					break;
					}
				else{
				System.out.println("invalid input please try again");
				System.out.println("error"+count);
				break;
				}
				}
			}
			System.out.println("BYE");
			System.exit(0);
			
			
		}
		
}

