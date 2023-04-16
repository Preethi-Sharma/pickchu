package assignment;

public class MissMatchException extends RuntimeException{
	MissMatchException(String s){
		super(s);
	}
}

class InvalidInputException extends RuntimeException{
	InvalidInputException(String s){
		super(s);
	}
}

class InsufficientFundException extends RuntimeException{
	InsufficientFundException(String s){
		super(s);
	}
}