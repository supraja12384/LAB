package Day14;
import java.time.LocalDate;
import java.util.Scanner;

public class lab15 {


		String FullName(String FirstName,String LastName) {
			System.out.println();
			return FirstName+" "+LastName;
		}
		int Age(String Dobstr) {
			
			LocalDate dob=LocalDate.parse(Dobstr);
			LocalDate current=LocalDate.now();
			return current.getYear()-dob.getYear();
		}
	public static void main(String[] args) {
		lab15 an=new lab15();
		String Fullname=an.FullName("v", "suprajayadav");
		int Age=an.Age("2002-03-30");
		System.out.println("Person Details");
		System.out.println("Full Name:" + Fullname);
		System.out.println("Age: "+Age);
		
		
	}
	}

