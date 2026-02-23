package Loops;

public class BookMyShow {
	public void ticketbooking(String catg) {
		if(catg.equals("Platinum")) {
			System.out.println("your seat allocatted in paltinum catg");
		}else if(catg.equals("gold")) {
			System.out.println("your seat allocatted in gold catg");
		}else if(catg.equals("silver")) {
			System.out.println("your seat allocatted in silver catg");
		}
		else {
			System.out.println("your seat allocatted in nela ticket");
		}
		
	}
	public static void main(String[] args) {
		BookMyShow s=new BookMyShow();
		s.ticketbooking("n");
	}

}
