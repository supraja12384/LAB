package encapsulation;

public class Circle {
	private int radius;
	
	public int getradius() {
		return radius;
	}
	public void setradius(int radius) {
		this.radius=radius;
	}


	public double perimeter() {
		return 2 * Math.PI * radius;
		
	}
	public double area() {
		return Math.PI * radius * radius;
		
	}
	public static void main(String[]args) {
		Circle c=new Circle();
		c.setradius(3);
		
		
		System.out.println("radius:"+c.getradius());
		System.out.println("area:"+c.area());
		System.out.println("perimeter:"+c.perimeter());
		
		
	}
}
