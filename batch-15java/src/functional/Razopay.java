package functional;
@FunctionalInterface
public interface Razopay {
	public abstract String payment();
	
	
	
	public static void main(String[] args) {
Razopay r1=new Razopay() {
			
			@Override
			public String payment() {
				
				return "payment sucess..";
			}
		};
		String status=r1.payment();
		System.out.println(status);
		
		System.out.println("=================");
		
Razopay r2=()-> "payment sucess..";
			
		String status1=r2.payment();
		System.out.println(status1);
		
	}

}
