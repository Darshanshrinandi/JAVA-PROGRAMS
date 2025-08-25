package UserDefinedExceptions;

public class AgeInvalidException extends RuntimeException{
	
	private String message;
	
	AgeInvalidException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
	
	

}
