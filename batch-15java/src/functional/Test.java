package functional;

public class Test {
//public - access modifier
	//String - return type
	//data - method name
	//input - parameter
	//{} -  method body
	//return - return statement
	// teja it - return value
	public String data(String input) {
		return "Teja it"+input;
	}
	public static void main(String[] args) {
		Test a=new Test();
		System.out.println(a.data(" Your Java Stop"));
		
	}

}
