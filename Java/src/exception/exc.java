package exception;
import java.util.Scanner;
public class exc {
	public static void main(String[]args) {
		Scanner Sc=new Scanner(System.in);
		int a;
		int b;
		try
		{
			System.out.println("enter the value a :");
			a=Sc.nextInt();
			System.out.println("enter the value b :");
			b=Sc.nextInt();
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("typeing the message"+e);
		}
		finally
		{
			System.out.println("the program is completed");
		}
	}

}