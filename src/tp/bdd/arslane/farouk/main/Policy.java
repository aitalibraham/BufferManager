package tp.bdd.arslane.farouk.main;

public interface Policy {
	public int pagesMiss=0;
	public abstract Pool addPage(Page page, Pool pool);
}
