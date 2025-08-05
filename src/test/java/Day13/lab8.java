package Day13;

import java.util.Scanner;

public class lab8 {
	String FirstName;
	String LastName;
	enum gender{M,F};
	String a;
	
public lab8(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
 
public String getFirstName() {
	return FirstName;
}
 
public void setFirstName(String firstName) {
	FirstName = firstName;
}
 
public String getLastName() {
	return LastName;
}
 
public void setLastName(String lastName) {
	LastName = lastName;
}
 
void number() {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number");
		a=sc.next();
	}
}
public String getA() {
	return a;
}
 
public void setA(String num) {
	a = num;}

void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());
	System.out.println("gender: "+lab8.gender.M);
	System.out.println("Phone Number: "+getA());
}
 
public static void main(String[] args) {
	lab8 p=new lab8("supraja", "yadav");
	p.number();
	p.display();
}
}