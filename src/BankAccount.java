//import com.techelevator.BankAccount;
//import com.techelevator.Customer;
//import com.techelevator.DollarAmount;

public class BankAccount {
	private Customer accountHolder;
	private String accountNumber;
	private DollarAmount balance;
	
	public BankAccount(Customer accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	//public DollarAmount deposit (DollarAmount amountToDeposit) {
		//this.balance.dollars += amountToDeposit.getDollars();
		//this.balance.cents += amountToDeposit.getCents();
		//return new DollarAmount (this.balance.dollars, this.balance.cents);
	public DollarAmount deposit(DollarAmount amountToDeposit) {
		balance = balance.plus(amountToDeposit);
		return balance;
	}
	
	public DollarAmount getBalance() {
		return balance;
	}
	public Customer getAccountHolder() {
		return accountHolder;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public DollarAmount withdraw(DollarAmount amountToWithdraw) {
		balance = balance.minus(amountToWithdraw);
		return balance;
		
	}
	public void transfer(BankAccount destinationAccount, DollarAmount amountToTransfer) {
		this.withdraw(amountToTransfer);
		destinationAccount.deposit(amountToTransfer);
	}
}
