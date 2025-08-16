package interfaces;

public class traingle implements shape {
	private double base;
    private double height;

    public traingle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
     
        return 0.5 * base * height;
    }

}
