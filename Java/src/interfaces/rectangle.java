package interfaces;

public class rectangle implements shape{
	private double length;
	private double width;
	
	public rectangle (double length,double width) {
		this.length=length;
		this.width=width;
	}
		
		@Override
		
		public double getArea() {
			return length * width;
	
	}

}
