package multilevelinheritance;

public class Main {
	public static void  main(String[]args) {
		B b =new B();
		b.browser();
		b.page();
		b.searching();
		C c= new C();
		c.click();
		c.close();
	}
}
