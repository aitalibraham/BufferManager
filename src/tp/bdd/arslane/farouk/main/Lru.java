package tp.bdd.arslane.farouk.main;

public class Lru implements Policy{
	
	@Override
	public Pool addPage(Page page, Pool pool) {
		if(pool.contains(page)) {
			pool.removeFromSlots(page);
			pool.addToSlots(page);
		}else{
			if(pool.getSlotsSize() == 4)
				pool.removeFromSlots(0);
			pool.addToSlots(page);
		}
		
		return pool;
	}	
}
