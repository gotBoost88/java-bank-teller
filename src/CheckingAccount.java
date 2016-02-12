//import com.techelevator.bank.DollarAmount;

public class CheckingAccount extends BankAccount {
	
	private static final DollarAmount OVERDRAFT_FEE = new DollarAmount(1000);
	private static final DollarAmount NEGATIVE_BALANCE_LIMIT = new DollarAmount(-10000);
	
	public CheckingAccount(Customer accountHolder, String accountNumber) {
		super(accountHolder, accountNumber);
	}
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		if(!getBalance().minus(amountToWithdraw).minus(OVERDRAFT_FEE).isLessThan(NEGATIVE_BALANCE_LIMIT)) {
			super.withdraw(amountToWithdraw);
			if(getBalance().isLessThan(DollarAmount.ZERO_DOLLARS)) {
				super.withdraw(OVERDRAFT_FEE);
			}
		}
		return getBalance();
	}
	public String toString() {
		return "Checking Account "+getAccountNumber();
	}
	
}
