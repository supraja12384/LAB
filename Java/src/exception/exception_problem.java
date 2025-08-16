package exception;
import java.util.Scanner;
public class exception_problem {
	public static void main(String[]args) {
		int[] records= {201,301};
		try (Scanner scanner=new Scanner(System.in)){
			System.out.println("enter user Id");
			if(scanner.hasNextInt()) {
				int userInput=scanner.nextInt();
				boolean found=false;
				for(int record:records) {
					if(record == userInput) {
						System.out.println("valid user");
						found = true;
						break;
					}
				
				if(!found) {
					System.out.println("inavlid use-resource not found");
				}
				else
				{
					System.out.println("Invalid input.please enter a number:");
				}
			}
		}
		
		}
	}
}
