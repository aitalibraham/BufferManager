package tp.bdd.arslane.farouk.main;

public class Main {

	public static void main(String[] args) {
		BufferManager bm=new BufferManager();
		bm.setMRU();
		Page a = new Page("a");
		Page b = new Page("b");
		Page c = new Page("c");
		Page d = new Page("d");
		Page e = new Page("e");
		bm.addPage(a);
		bm.addPage(b);
		bm.addPage(c);
		bm.addPage(d);
		bm.addPage(e);
		bm.addPage(a);
		bm.addPage(b);
		bm.addPage(c);
		bm.addPage(d);
		bm.addPage(e);

		System.out.println(bm.pool.pagesMisses);
		
		
	}
}
