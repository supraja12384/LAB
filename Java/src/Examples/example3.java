package Examples;
import java.util.Scanner;
public class example3 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
        char ch =sc.next().toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }
	}
}
