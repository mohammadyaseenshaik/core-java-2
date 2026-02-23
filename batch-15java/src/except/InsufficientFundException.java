package except;

public class InsufficientFundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InsufficientFundException() {
		System.out.println("add amount");
		
	}
public InsufficientFundException(String s) {//if we want add message in exception then we use arg constructor 
	super(s);
		
	}
	

}
