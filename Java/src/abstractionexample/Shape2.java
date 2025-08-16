package abstractionexample;

public abstract class Shape2 {
	abstract double calculateArea();
	abstract double claculatePerimeter();

	public static void main(String[] args) {
		Shape2 triangle=new Triangle2(10, 4, 4, 6, 6);
		System.out.println(triangle.calculateArea());
		System.out.println(triangle.claculatePerimeter()); 
		Shape2 circle=new Circle2(2);
		System.out.println(circle.calculateArea());
		System.out.println(circle.claculatePerimeter());
		
		
	}
	}
	class Triangle2 extends Shape2 {
		private double base,height;
		 private double a, b, c;
		    public Triangle2(double base, double height,double a, double b, double c) {
		       this.base=base;
		       this.height=height;
		    	this.a = a;
		        this.b = b;
		        this.c = c;
		    }  
		    @Override
		    double calculateArea() {
				return 0.5*base*height;
		         
		    }
			@Override
			double claculatePerimeter() {
				
				return a + b + c;
			}

	}
	class Circle2 extends Shape2 {
		 private double radius;
		    public Circle2(double radius) {
		        this.radius = radius;
		    }
		    @Override
		    double calculateArea() {
		        return Math.PI * radius * radius;
		    }
			@Override
			double claculatePerimeter() {
				// TODO Auto-generated method stub
				return 2*Math.PI*radius;
			}

	}


