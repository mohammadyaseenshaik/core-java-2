package functional;

@FunctionalInterface
public interface TejaIT {
	public abstract String tagline(String val);
public static void main(String[] args) {
	//anonamus inner type
	TejaIT t1=new TejaIT() {
		@Override
		public String tagline(String val) {
			
			return "Teja IT".concat(" "+val);
		}
	};
	String tagline= t1.tagline("Your Java Stop");
	System.out.println(tagline);

System.out.println("============================");
// Lambda expression
TejaIT t2= val->  "Teja IT".concat(" "+val);

String tagline2= t2.tagline("Your Java Stop");
System.out.println(tagline2);
	
}
}