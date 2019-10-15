package tp.bdd.arslane.farouk.main;

public class Main {

	public static void main(String[] args) {
		BufferManager bm=new BufferManager();
		bm.setLRU();
		Page a = new Page("a");
		Page b = new Page("b");
		Page c = new Page("c");
		Page d = new Page("d");
		bm.addPage(a);
		bm.addPage(b);
		bm.addPage(c);
		bm.addPage(d);
		bm.addPage(a);
		bm.addPage(a);
		
		System.out.println(bm.toString());
		
		
	}
}
