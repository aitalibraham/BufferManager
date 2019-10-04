package tp.bdd.arslane.farouk.main;

public class Main {

	public static void main(String[] args) {
		BufferManager bm;
		bm=new LruBuffer();
		Page a= new Page("A");
		Page b= new Page("B");
		Page c= new Page("C");
		Page d= new Page("D");
		Page e= new Page("E");
		bm.addPage(a);
		bm.addPage(a);
		bm.addPage(b);
		bm.addPage(c);
		bm.addPage(d);
		bm.addPage(a);
		bm.addPage(a);
		bm.addPage(a);
		bm.addPage(a);
		bm.addPage(a);
		bm.addPage(a);
		
		System.out.println(bm.toString());
		
		
	}
}
