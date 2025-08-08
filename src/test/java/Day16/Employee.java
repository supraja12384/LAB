package Day16;

public class Employee {
	String first_Name;
	String last_Name;
	
	public Employee(String first_Name, String last_Name) throws NameBlankException {
	if(first_Name==null||first_Name.contains("")||last_Name==null||last_Name.contains("")) {
		throw new NameBlankException("First and last name cannot be blank");
	}
	
		this.first_Name = first_Name;
		this.last_Name = last_Name;
	}
	public String getFullName() {
		return first_Name+" "+last_Name;
	}
	public static void main(String[] args) {
		
		try {
			Employee emp=new Employee("V", "supraja yadav");
			Employee em=new Employee("", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception:"+e.getMessage());
		}
	}


}
