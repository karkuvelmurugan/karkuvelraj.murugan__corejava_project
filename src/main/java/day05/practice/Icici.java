package day05.practice;


public class Icici implements Atm {

		public boolean deposit(Account account, double amount) {
			account.balance += amount;
			return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
			double myBalance = account.balance - amount - 10.00d;
			if (myBalance < 10000) {
				throw new Exception("You can't withdraw your minimum balance.");
			} else {
				account.balance -= amount-10.00d;
				return true;
			}
		}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}