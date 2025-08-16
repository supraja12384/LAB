package Examples;

public class example5 {
	private int id;
	private String name;
	protected String address;
	
	public int getId() {
	return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return address;
	}
		
	public void setAddress(String address) {
	this.address=address;
	}
	public static void main(String[]args) {
		example5 p=new example5();
		p.setId(10);
		p.setname("supraja");
		p.setAddress("kadapa");
		
		System.out.println(p.getId());
		System.out.println(p.getname());
		System.out.println(p.getAddress());
	}

}
