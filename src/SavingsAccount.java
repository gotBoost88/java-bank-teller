//import com.techelevator.bank.DollarAmount;

public class SavingsAccount extends BankAccount {
	
	private static final DollarAmount WITHDRAWAL_FEE_BALANCE_THRESHOLD = new DollarAmount(15000);
	private static final DollarAmount WITHDRAWAL_FEE = new DollarAmount(200);
	
	public SavingsAccount(Customer accountHolder, String accountNumber) {
		super(accountHolder, accountNumber);
	}
	public DollarAmount withdrawal(DollarAmount amountToWithdraw) {
		if(this.getBalance().isLessThan(WITHDRAWAL_FEE_BALANCE_THRESHOLD)) {
			amountToWithdraw = amountToWithdraw.plus(WITHDRAWAL_FEE);
		}
		if(amountToWithdraw.isGreaterThan(this.getBalance())) {
			return this.getBalance();
		}else {
			return super.withdraw(amountToWithdraw);
		}
	}
	public String toString() {
		return "Savings account "+getAccountNumber();
	}
	
}
