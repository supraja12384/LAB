package interfaces;

public class Main {
	public static void main(String[] args) {
     
        rectangle rect = new rectangle(20,12);
       
        circle cir = new circle(3);
               
        traingle tri = new traingle(2,4);

      
        System.out.println("Rectangle: " + rect.getArea());
        
      
        System.out.println("Circle: " + cir.getArea());
        
        System.out.println("Triangle: " + tri.getArea());
    }

}
