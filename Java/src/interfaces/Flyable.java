package interfaces;

public interface Flyable {
	void fly_ob();


}
class Spacecraft implements Flyable{
	@Override
	public void fly_ob() {
		System.out.println("spacecraft is flying");
		
	}
	
}
class Airplane implements Flyable{
	@Override
	public void fly_ob() {
		System.out.println("airplance is flying");
		
	}
}
class Helicopter implements Flyable{
	@Override
	public void fly_ob() {
		System.out.println("helicopter is flying");
		
		
	}
public static void main(String[]args) {
		
		Flyable s=new Spacecraft();
		s.fly_ob();
		Flyable a=new Airplane();
		a.fly_ob();
		Flyable h=new Helicopter();
		h.fly_ob();
	}
}
