package features;

public interface TeamLead {
	public String  company();
	
	public default String role() {
		return "devops";
	}
	
	public static void location() {
		System.out.println("hyd");
	}

}
