package tp.bdd.arslane.farouk.main;

public class LruBuffer extends BufferManager{

	public LruBuffer() {
		super.pool=new Pool();
	}
	@Override
	public void addPage(Page page) {
		if(pool.slots.contains(page)) {
			pool.slots.remove(page);
			pool.slots.add(page);
		}else{
			if(pool.slots.size() == 4)
				pool.slots.remove(0);
			pool.slots.add(page);
		}
	}
	
	@Override
	public String toString() {
		return pool.toString();
	}
	
}
