package collect;

import java.util.Comparator;

public class Basedonid implements Comparator<Pedilite> {

	@Override
	public int compare(Pedilite o1, Pedilite o2) {
		
		return o1.pid-o2.pid;
	}
	
	

}
