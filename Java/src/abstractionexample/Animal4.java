package abstractionexample;

public abstract class Animal4 {

		abstract void eat();
		abstract void sleep();
		public static void main(String[] args) {
	    	
	    		 Animal4 l = new lion();
	    	        l.eat();
	    	        l.sleep();

	    	        System.out.println();

	    	        Animal4 t = new tiger();
	    	        t.eat();
	    	        t.sleep();

	    	        System.out.println();

	    	        Animal4 d = new Deer();
	    	        d.eat();
	    	        d.sleep();
			
		}
	}
	class lion extends Animal4 {
		@Override
		public void eat() {
			System.out.println("lion eats meat");
			
		}
		@Override
		public void sleep() {
			System.out.println("lion is sleeping");
		}
	}
	class tiger extends Animal4 {
		@Override
		 void eat() {
			System.out.println("tiger eats meat");
			
		}
		@Override
		 void sleep() {
			System.out.println("tiger is sleepig");
		}
	}

	 class Deer extends Animal4 {
		@Override
		 void eat() {
			System.out.println("deer eats");
			
		}
		@Override
		 void sleep() {
			System.out.println("deer is ");
		}
	}
	
	


