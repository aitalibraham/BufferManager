package tp.bdd.arslane.farouk.main;

public class Fifo implements Policy{

	@Override
	public Pool addPage(Page page, Pool pool) {
		if(pool.getSlotsSize() == 4)
				pool.removeFromSlots(0);
		pool.addToSlots(page);
		
		return pool;
	}	



}
