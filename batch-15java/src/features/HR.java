package features;

public interface HR {
	public String  company();
	
	
	public default String role() {
		return "human resorce";
	}
	public default void attendance() {
		System.out.println("HR team attendance must be 75%");
	}
	public static void location() {
		System.out.println("chennai");
	}

}
