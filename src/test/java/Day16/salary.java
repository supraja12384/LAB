package Day16;

public class salary {
	double salary;

	public salary(double salary) throws EmployeeException{
		if(salary<3000) {
			throw new EmployeeException("Salary is below 3000");
		}
		this.salary = salary;
		
	}
	public static void main(String[] args) {
		try {
			salary sal=new salary(2500);
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
