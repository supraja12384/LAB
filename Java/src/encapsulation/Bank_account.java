package encapsulation;

public class Bank_account {
	private int accountnumber;
	private int balance;
	
	public int getaccountnumber() {
		return accountnumber;
	}
	public void setaccountnumber(int accountnumber) {
		this.accountnumber=accountnumber;
	}
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}


	public static void main(String[]args) {
		Bank_account b= new Bank_account();
		b.setaccountnumber(123);
		b.setbalance(3000);
	
		System.out.println("accountnumber :"+b.getaccountnumber());
		System.out.println("balance :" +b.getbalance());
	}
}
