package encapsulation;

public class Employee {
	private int employee_id;
	private String employee_name;
	private double employee_salary;
	
	public int getemployee_id() {
		return employee_id;
	}
	public void setemployee_id(int employee_id) {
		this.employee_id=employee_id;
	}
	
	public String getemployee_name() {
		return employee_name;
	}
	public void setemployee_name(String employee_name) {
		this.employee_name=employee_name;
	}
	
	public String getemployee_salary() {
		return "$"+employee_salary;
	}
	public void setemployee_salary(double employee_salary) {
		this.employee_salary=employee_salary;
	}
	
	public static void main(String[]args) {
		Employee e= new Employee();
		e.setemployee_id(21);
		e.setemployee_name("supraja");
		e.setemployee_salary(400000);
		
		System.out.println("id :"+e.getemployee_id());
		System.out.println("name :"+e.getemployee_name());
		System.out.println("salary :"+e.getemployee_salary());
	}
}
