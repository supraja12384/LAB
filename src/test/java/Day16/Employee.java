package Day16;

public class Employee {
	String firstName;
	String lastName;
	
	public Employee(String firstName, String lastName) throws NameBlankException {
	if(firstName==null||firstName.contains("")||lastName==null||lastName.contains("")) {
		throw new NameBlankException("First name and last name cannot be blank");
	}
	
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFullName() {
		return firstName+" "+lastName;
	}
	public static void main(String[] args) {
		
		try {
			Employee emp=new Employee("V", "supraja yadav");
			Employee emp1=new Employee("", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception:"+e.getMessage());
		}
	}


}
