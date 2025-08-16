package encapsulation;

public class Car {
		private String company_name;
		private String model_name;
		private int Year;
		private String mileage;

		public Car(String mileage) {
			super();
			this.mileage = mileage;
		}
		public String getCompany_name() {
			return company_name;
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}
		public String getModel_name() {
			return model_name;
		}
		public void setModel_name(String model_name) {
			this.model_name = model_name;
		}
		public int getYear() {
			return Year;
		}
		public void setYear(int year) {
			Year = year;
		}

		public String getMileage() {
			return mileage;
		}

		public static void main(String[] args) {
			Car c=new Car("80km/hr");
			c.setCompany_name("Benz");
			c.setModel_name("g4");
			c.setYear(1992);
			System.out.println("Company name: "+c.getCompany_name());
			System.out.println("Model name: "+c.getModel_name());
			System.out.println("Year:"+c.getYear());
			System.out.println("milege"+c.getMileage());
		}

	}

