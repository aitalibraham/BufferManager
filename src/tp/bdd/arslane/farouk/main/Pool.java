package tp.bdd.arslane.farouk.main;

import java.util.ArrayList;
import java.util.List;

public class Pool {

	public List<Page> slots;
	public int pagesMisses=0;
	
	public Pool() {
		slots = new ArrayList<Page>();
	}
	
	@Override
	public String toString() {
		return slots.toString();
	}
	
	public void addToSlots(Page page) {
		this.slots.add(page);
	}
	public void removeFromSlots(Page page) {
		this.slots.remove(page);
	}
	public void removeFromSlots(int index) {
		this.slots.remove(index);
	}
	public int getSlotsSize() {
		return this.slots.size();
	}
	public boolean contains(Page page) {
		return this.slots.contains(page);
	}
	public void addMiss() {
		this.pagesMisses++;
	}
}
