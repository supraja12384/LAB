package abstractionexample;

public abstract class Bank_account {
	double balance;
	
	Bank_account(double balance) {
			this.balance = balance;
		}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);

	public static void main(String[] args) {
		Bank_account savings=new Savings(5000);
		savings.deposit(1000);
		savings.withdraw(2000);
		Bank_account current=new CurrentAccount(3000);
		current.deposit(1500);
		current.withdraw(2000);
	}

	}
	class Savings extends Bank_account {

		public Savings(double balance) {
			super(balance);
			System.out.println("Savings Account:");
		}

		@Override
		void deposit(double amount) {
			balance=balance+amount;
			System.out.println("Deposited money:"+amount+" Balance after Deposited:"+balance);
		}

		void withdraw(double amount) {
			if(amount<=balance)
			{
				balance=balance-amount;
				System.out.println("Mone to be withdrawed:"+amount+" updated balance: "+balance);
			}
		}
	}
	class CurrentAccount extends Bank_account {

		CurrentAccount(double balance) {
			super(balance);
			// TODO Auto-generated constructor stub
			System.out.println("Current Account:");
		}

		@Override
		void deposit(double amount) {
			balance=balance+amount;
			System.out.println("Deposited money:"+amount+" Balance after Deposited:"+balance);
		}

		void withdraw(double amount) {
			if(amount<=balance)
			{
				balance=balance-amount;
				System.out.println("Mone to be withdrawed:"+amount+" updated balance: "+balance);
			}
		}
	}


		