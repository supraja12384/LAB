package Examples;

public class example6 {
	private double length;
	private double width;

	public double getlength() {
		return length;
	}
	public void setlength(double length) {
		this.length=length;
	}
	public double getwidth() {
		return width;
	}
	public void setwidth(double width) {
		this.width=width;
	}
	
	public static void main(String[]args) {
		example6 r = new example6();
		r.setlength(4);
		r.setwidth(6);
		
		System.out.println("length:"+r.getlength());
		System.out.println("width:"+r.getwidth());
	}

}
