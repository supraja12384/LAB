package Day16;
import java.util.Arrays;
public class Product {
	public static void main(String[]args) {
		String [] products = {"supraja", "yadav","chandu","sree"};
		System.out.println("Original product :");
		for(String a : products) {
			System.out.println(a);
		}
		Arrays.sort(products);
		System.out.println("sorted produts :");
		for(String b : products) {
			System.out.println(b);
		}
	}
}
