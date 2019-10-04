package tp.bdd.arslane.farouk.main;

public class Page {

	public String label;
	
	public Page(String label) {
		this.label=label;
	}
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Page && ((Page) o).label==this.label)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return label;
	}
	
}
