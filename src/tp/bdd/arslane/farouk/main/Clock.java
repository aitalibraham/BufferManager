package tp.bdd.arslane.farouk.main;

public class Clock implements Policy{
	public int size = 4;
	public int clockwise = 0;
	
	
	@Override
	public Pool addPage(Page page, Pool pool) {
		// TODO Auto-generated method stub
		Boolean added = false;
		clockwise = 0;
		
		page.flag = 1;
		if ( pool.slots.size() < size) {
			while (clockwise < pool.slots.size()) { 
				if(pool.slots.get(clockwise).flag != 0 )
					pool.slots.get(clockwise).flag = 0;
				else {
					pool.slots.set(clockwise, page);
					pool.addMiss();
					added = true;
				}
				clockwise++;
			}
			clockwise = clockwise % size;
			if (!added ) {
				System.out.println(clockwise);
				pool.slots.add(page);
				pool.addMiss();
				added = true;
			}
			
		}
		else if( !added ) {
			while(pool.slots.get(clockwise).flag != 0) {
				pool.slots.get(clockwise).flag = 0;
				clockwise++;
				clockwise = clockwise % size;
			}
			pool.slots.set(clockwise, page);
			pool.addMiss();
			added = true;
		}
		
		return pool;
	}
	
}
