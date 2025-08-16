package collections;
import java.util.*;


public class vector {
	public static void main(String[]args) {
		//size=no of elements present in list
		//capacity=array capacity
		Vector v1=new Vector();
		v1.add("supraja");
		v1.add("sai");
		v1.add("sree");
		v1.add("thikka");
		
		Vector v2=new Vector();
		v2.add("suresh");
		v2.add("saipratap"); 
		
		Vector v3=new Vector();
		v3.add("saipratap");
		v3.add("suresh"); 
		
		System.out.println(v1);
		v1.addAll(v2);
		System.out.println(v1);
		
	//	v1.clear();
		System.out.println(v1.containsAll(v3));
		
		/*System.out.println("Size:"+v1.size());
		System.out.println("Capacity :"+v1.capacity());*/
	
	}

}