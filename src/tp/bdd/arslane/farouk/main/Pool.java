package tp.bdd.arslane.farouk.main;

import java.util.ArrayList;
import java.util.List;

public class Pool {

	public List<Page> slots;
	
	public Pool() {
		slots = new ArrayList<Page>();
	}
	
	@Override
	public String toString() {
		return slots.toString();
	}
}
