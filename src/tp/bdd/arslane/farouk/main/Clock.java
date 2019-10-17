package tp.bdd.arslane.farouk.main;

public class Clock implements Policy{
	public int size = 4;
	public int clockwise = 0;
	
	@Override
	public Pool addPage(Page page, Pool pool) {
		// TODO Auto-generated method stub
		System.out.println(pool.getSlotsSize());
		while( pool.slots.get(clockwise).flag != 0) {
			pool.slots.get(clockwise).flag = 0;
			clockwise++;
			clockwise = clockwise % size;
		}
		
		pool.slots.set(clockwise, page);
		return pool;
	}
	
}
