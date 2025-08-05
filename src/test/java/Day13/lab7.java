package Day13;

import java.util.Scanner;

public class lab7 {
	String FirstName;
	String LastName;
	char gender;
	String a;
	
public lab7(String firstName, String lastName, char gender) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.gender = gender;
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
 
public char getGender() {
	return gender;
}
 
public void setGender(char gender) {
	this.gender = gender;
}
void number() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	a=scan.next();
}
public String getA() {
	return a;
}
 
public void setA(String num) {
	a = num;}

void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());
	System.out.println("gender: "+getGender());
	System.out.println("Phone Number: "+getA());
}
 
public static void main(String[] args) {
	lab7 p=new lab7("supraja", "yadav",'F');
	p.number();
	p.display();
}
}

