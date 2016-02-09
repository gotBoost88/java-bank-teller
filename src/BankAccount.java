
public class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private DollarAmount balance;
	
	public BankAccount (DollarAmount balance) {
		this.balance = balance;
	}
	//public DollarAmount deposit (DollarAmount amountToDeposit) {
		//this.balance.dollars += amountToDeposit.getDollars();
		//this.balance.cents += amountToDeposit.getCents();
		//return new DollarAmount (this.balance.dollars, this.balance.cents);
	public DollarAmount deposit (DollarAmount amountToDeposit) {
		DollarAmount amount1 = new DollarAmount (145);
		amount1 = this.balance.plus(amountToDeposit);
		this.balance = amount1;
		return this.balance;
	}
	
	public DollarAmount getBalance () {
		return new DollarAmount (balance.getDollars(), balance.getCents());
	}
	public DollarAmount withdraw (DollarAmount amountToWithdraw) {
		this.balance.dollars -= amountToWithdraw.getDollars();
		this.balance.cents -= amountToWithdraw.getCents();
		
		return new DollarAmount (balance.dollars, balance.cents);
	}
	public void transfer (BankAccount destinationAccount, DollarAmount transferAmount) {
		destinationAccount.balance.dollars += transferAmount.getDollars();
		destinationAccount.balance.cents += transferAmount.getCents();
	}
}
