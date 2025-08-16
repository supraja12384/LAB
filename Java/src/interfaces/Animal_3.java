package interfaces;

public interface Animal_3 {
	void bark();
	public static void main(String[]args) {
		Animal_3 a=new Dog();
		a.bark();
	}

}
class Dog implements Animal_3 {
	@Override
	public void bark() {
		System.out.println("dog is barking");
	}
}