package Practice2;

public class child implements parent1,parent2,parent3{
	@Override
	public String car() {
		// TODO Auto-generated method stub
		return "car from parent2";
	}

	@Override
	public String bike() {
		// TODO Auto-generated method stub
		return "bike from parent1";
	}
	@Override
	public String bus() {
		// TODO Auto-generated method stub
		return "bus from parent3";
	}
	
	public static void main(String[] args) {
		child a=new child();
		System.out.println(a.bike());
		System.out.println(a.car());
		System.out.println(a.bus());
		
		
		
	}

	

	

}
