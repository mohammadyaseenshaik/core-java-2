package features;

public class Employee implements TeamLead,HR {
//Diamond problem---backward compactability 
	@Override
	public String company() {
		return "Infosys...";	
	}
	@Override
	public String role() {
		return TeamLead.super.role();
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.company());
		System.out.println(e.role());
		HR.location();
		TeamLead.location();
	}

}
