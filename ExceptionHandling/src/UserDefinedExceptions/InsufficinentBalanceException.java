package UserDefinedExceptions;

public class InsufficinentBalanceException extends RuntimeException {
	
	private String message;
	
	InsufficinentBalanceException(String message){
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		 return message;
	}
	

}
