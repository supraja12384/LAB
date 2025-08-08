package Day16;

public class Agevalidation {
		int age;

		public Agevalidation(int age)throws AgevalidationException {
		if(age<=15) {
			
			throw new AgevalidationException("Age should be above 15");
		}
			this.age = age;
		}
		public static void main(String[] args) {
			try {
				Agevalidation a=new Agevalidation(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Exception:"+e.getMessage());
			}
		}
	}

