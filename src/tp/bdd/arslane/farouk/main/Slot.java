package tp.bdd.arslane.farouk.main;

public class Slot { //Frame

	private Page page;
	private boolean dirty;
	private int pinCount;
	
	public Slot() {
		this.page=null;
		this.dirty=false;
		this.pinCount=0;
	}
	public void setDirty() {
		dirty=true;
	}
	public void usetDirty() {
		dirty=false;
	}
	public void setPage(Page page) {
		this.page=page;
	}
	public void pin() {
		this.pinCount++;
	}
	public void unpin() {
		this.pinCount--;
	}
}
