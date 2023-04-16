package assignment;
import java.util.Scanner;
public class Driver {
public void driver(CheckBal c) {
	Scanner sc = new Scanner(System.in);
	int ch = sc.nextInt();
	switch(ch){
	case 1:c.deposit();
     break;
	case 2:c.withdraw();
	 break;
	default: throw new InvalidInputException("Invalid input.");
	}
}
}
