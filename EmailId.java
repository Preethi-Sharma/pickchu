package assignment;
import java.util.Scanner;
public class EmailId {

	public static void acceptId(String s)
	{
		if(s.endsWith("@gmail.com"))
		{
			System.out.println("YOUR ACCOUNT IS SUCCESSFULLY CREATED");
		}
		else {
			System.out.println("IMPROPER EMAIL ID TRY AGAIN ");
		}
	}
	public static void checkId(String s, String p)
	{
		if(s.equals(p))
		{
			System.out.println("YOUR SUCCESSFULLY ENTERED INTO THE APPLICATION");
			Banks b = new Banks();
			b.banks();
			
		}else
		{
			throw new MissMatchException("Invalid Mail ID");
		}
	}
	
	
	public static void start() {
		System.out.println("Select an Option");
		System.out.println("0. To Exit ");
		System.out.println("1. Create an Account ");
		System.out.println("2. Login into application  ");
		
	}
public static void main(String[] args) {
	String email;
	String email2;
	String temp = null;
	
	Scanner em = new Scanner(System.in);
	
	int option = 1;
	while(option > 0)
	{
		
		start();
		int option2 = em.nextInt();
		switch(option2)
		{
		case 0: option=0;
				break;
		case 1: System.out.println(" To Create an Account, Enter your Email ID ");
				 email= em.next();
				 temp= email;
				acceptId(email);
				break;
		case 2: System.out.println(" To Enter into the Application, Enter your Email ID  ");		
				 email2= em.next();
				checkId(email2, temp);
				break;
		}
	}
	
	
	
	
	
	
}
	
	
	
}
