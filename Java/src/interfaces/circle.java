package interfaces;

public class circle implements shape {
	 private double radius;

	    
	    public circle(double radius) {
	        this.radius = radius;
	    }

	  
	    @Override
	    public double getArea() {
	     
	        return Math.PI * radius * radius;
	    }
	}

