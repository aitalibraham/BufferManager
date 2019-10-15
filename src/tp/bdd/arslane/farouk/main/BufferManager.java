package tp.bdd.arslane.farouk.main;

public class BufferManager {
	public Pool pool = new Pool();
	Policy policy;
	
	public void setLRU() {
		this.policy=new Lru();
	}
	public void setFIFO() {
		this.policy=new Fifo();
	}
	
	public void addPage(Page page) {
		this.policy.addPage(page, this.pool);
	}
	
	@Override
	public String toString() {
		return pool.toString();
	}
}
