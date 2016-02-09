
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DollarAmount testWithdraw = new DollarAmount(50);
		DollarAmount testBalance = new DollarAmount(50);
		BankAccount testAccount = new BankAccount(testBalance);
		DollarAmount testAmount = new DollarAmount(100);
		testAccount.deposit(testAmount);
		//System.out.println(testAccount.getBalance());
		System.out.println("Account Balance = $"+testAccount.getBalance().dollars + testAccount.getBalance().cents);
		testAccount.withdraw(testWithdraw);
		System.out.println("Account Balance = $"+testAccount.getBalance());//.getDollars() + testAccount.getBalance().getCents());
	}

}
