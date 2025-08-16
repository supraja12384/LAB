package abstractionexample;

abstract class Animal {
	 abstract void sound();
		public static void main(String[]args) {
			Animal a=new Tiger();
			a.sound();
			Animal b=new Cat();
			b.sound();
		}

}
class Cat extends Animal{
	 void sound() 
	 {
		 System.out.println("meow meow");
	 }
	
}
class Tiger extends Animal{
	void sound() 
	{
		System.out.println("bow bow");
	}
}


 
	