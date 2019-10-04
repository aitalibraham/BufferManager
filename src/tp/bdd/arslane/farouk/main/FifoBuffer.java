package tp.bdd.arslane.farouk.main;

public class FifoBuffer extends BufferManager{

	@Override
	public void addPage(Page page) {
		if(pool.slots.size()<4) {
			pool.slots.add(page);
		}else if(pool.slots.size()==4) {
			pool.slots.remove(pool.slots.get(0));
			pool.slots.add(page);
		}
	}
	
	@Override
	public String toString() {
		return pool.toString();
	}

}
