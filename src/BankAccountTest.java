
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DollarAmount testWithdraw = new DollarAmount(50, 15);
		DollarAmount testBalance = new DollarAmount(45, 25);
		BankAccount testAccount = new BankAccount(testBalance);
		DollarAmount testAmount = new DollarAmount(95, 40);
		testAccount.deposit(testAmount);
		System.out.println("Balance after deposit is "+testAccount.getBalance());
		System.out.println("Account Balance = $"+testAccount.getBalance().dollars + "." + testAccount.getBalance().cents);
		testAccount.withdraw(testWithdraw);
		System.out.println("Account Balance = $"+testAccount.getBalance());//.getDollars() + testAccount.getBalance().getCents());
	}

}
