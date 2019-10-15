package tp.bdd.arslane.farouk.main;

public class Mru implements Policy{

	@Override
	public Pool addPage(Page page, Pool pool) {
		if(pool.contains(page)) {
			pool.removeFromSlots(page);
			pool.addToSlots(page);
		}else{
			if(pool.getSlotsSize() == 4)
				pool.removeFromSlots(3);
			pool.addToSlots(page);
		}
		
		return pool;
	}

}
