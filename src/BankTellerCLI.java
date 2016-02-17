import java.util.ArrayList;
import java.util.List;

//import com.techelevator.util.Terminal;

public class BankTellerCLI {
	private Bank theBank;

	public BankTellerCLI() {
		theBank = new Bank();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTellerCLI application = new BankTellerCLI();
		application.run();
	}

	public void run() {
		while (true) {
			String choice = getChoiceFromMainMenu();
			if (choice.equals("1")) {
				addCustomer();

			} else if (choice.equals("2")) {
				printBanner("ADD ACCOUNT\n");
				System.out.println("Choose a customer:\n");
				displayBank();

				String customerNumber = getUserInput("Enter customer number\n");
				int convertedCustomerNumber = Integer.parseInt(customerNumber);
				Customer chosenCustomer = theBank.getCustomers().get(convertedCustomerNumber - 1);
				System.out.println("1) Checking");
				System.out.println("2) Savings");

				String newBankAccountChoice = getUserInput("Enter account type number\n");
				int convertedBankAccountChoice = Integer.parseInt(newBankAccountChoice);

				String newAccountNumber = getUserInput("Enter new account number\n");
				// need a method to create a new checking or savings account
				if (convertedBankAccountChoice == 1) { // indicates a checking
														// account
					// System.out.println("Inside Checking Account : "+
					// theBank.getCustomers().get(convertedCustomerNumber -1
					// ).getName());
					CheckingAccount newAccount = new CheckingAccount(chosenCustomer, newAccountNumber);
					newAccount.setinitialBalance();
					chosenCustomer.addAccount(newAccount);
					System.out.println("New Checking Account created : "
							+ theBank.getCustomers().get(convertedCustomerNumber - 1).getName() + " "
							+ newAccountNumber);
				} else if (convertedBankAccountChoice == 2) { // indicates a
																// savings
																// account
					SavingsAccount newAccount = new SavingsAccount(chosenCustomer, newAccountNumber);
					chosenCustomer.addAccount(newAccount);
					System.out.println("New Savings Account created : "
							+ theBank.getCustomers().get(convertedCustomerNumber - 1).getName() + " "
							+ newAccountNumber);

				}

				// need a method to add the account number to the new account

			} else if (choice.equals("3")) {
				runDeposit();

				// addAccount(newBankAccount);

			} else if (choice.equals("6")) {
				exit();

			}
		}
	}

	private String getChoiceFromMainMenu() {
		printBanner("MAIN MENU");
		System.out.println("Please choose from the following options:\n");

		System.out.println("1) Add Customer");
		System.out.println("2) Add Account");
		System.out.println("3) Deposit");
		System.out.println("4) Withdrawal");
		System.out.println("5) Transfer");
		System.out.println("6) Exit");
		System.out.println();

		return getUserInput("Enter Number");
	}

	public void addCustomer() {
		printBanner("ADD CUSTOMER");
		String name = getUserInput("Enter Name");
		String address = getUserInput("Enter Address");
		String phoneNumber = getUserInput("Enter Phone Number");
		Customer newCustomer = new Customer(name, address, phoneNumber);
		theBank.addCustomer(newCustomer);
		System.out.println("\n*** " + newCustomer.getName() + " added as a customer ***");
	}

	/*
	 * public void addAccount(BankAccount newAccount){ printBanner("ADD ACCOUNT"
	 * );
	 * 
	 * System.out.println("\nChoose a customer:\n");
	 * 
	 * for(Customer cust : theBank.getCustomers()){ System.out.println(
	 * (theBank.getCustomers().indexOf(cust)+1)+") "+ cust.getName() +" "
	 * +cust.getAddress()+" "+cust.getPhoneNumber()); }
	 * 
	 * 
	 * System.out.println("1) Checking"); System.out.println("2) Savings");
	 * 
	 * 
	 * 
	 * 
	 * String newBankAccountChoice = getUserInput("Enter account type number\n"
	 * );
	 * 
	 * while(true) { //String choice; // newAccount1; //2SavingsAccount
	 * newAccount2; if(newBankAccountChoice == ("1")) { //String accountNumber =
	 * getUserInput("Please enter an account number"); addAccount(new
	 * CheckingAccount(getUserInput("Please enter an account number")));
	 * 
	 * 
	 * 
	 * } if(newBankAccountChoice == ("2")) {
	 * 
	 * addAccount( new SavingsAccount(getUserInput(
	 * "Please enter an account number"))); //addAccount(newAccount2);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * //addAccount(newAccount); System.out.println("\n*** "
	 * +newAccount.getAccountNumber()+"added to accounts ***"); }
	 * 
	 * 
	 * }
	 * 
	 */
	public void displayBank() {

		for (Customer cust : theBank.getCustomers()) {
			// int count = 0;
			// System.out.println("1) "+theBank.getCustomers());
			// System.out.println("1) "+theBank.getCustomers().indexOf(cust));
			// System.out.println("1)
			// "+theBank.getCustomers().iterator().toString());
			// System.out.println( count+") "+ cust.getName() +" "
			// +cust.getAddress()+" "+cust.getPhoneNumber());
			System.out.println((theBank.getCustomers().indexOf(cust) + 1) + ") " + cust.getName() + " "
					+ cust.getAddress() + " " + cust.getPhoneNumber());

			// System.out.println();

		}

	}

	public void runDeposit() {
		printBanner("DEPOSIT");

		System.out.println("\nChoose a customer:\n");
		displayBank();
		String customerNumber = getUserInput("Enter customer number\n");
		int convertedCustomerNumber = Integer.parseInt(customerNumber);
		Customer chosenCustomer = theBank.getCustomers().get(convertedCustomerNumber - 1);

		System.out.println("Choose an account:\n");
		//BankAccount accountSelect = null;
		//List<BankAccount> accounts = new ArrayList<BankAccount>();
		for (BankAccount theAccount : chosenCustomer.getAccounts()) {
			System.out.println((chosenCustomer.getAccounts().indexOf(theAccount) + 1) + ") " + theAccount.getAccountType() + " "
					+ theAccount.getAccountNumber());
			//System.out.println("Enter number >>>");
			String newDepositAccountChoice = getUserInput("Enter account type number\n");
			int convertednewDepositAccountChoice = Integer.parseInt(newDepositAccountChoice);
			System.out.println("You chose "+theAccount.getAccountType()+" "+theAccount.getAccountNumber());
			String depositAmount = getUserInput("Enter an amount to deposit:\n");
			long convertedDepositAmount = Long.parseLong(depositAmount);
			System.out.println("*** $"+depositAmount+" Deposited into "+theAccount.getAccountType()+" "+theAccount.getAccountNumber()+" ***");
			//accountSelect.getBalance();
			//System.out.println("New Balance is "+theAccount.getBalance());
			DollarAmount depositDollar = new DollarAmount(convertedDepositAmount * 100);
			//int depositCents = 00;
			//DollarAmount convertedDepositDollar = new DollarAmount(depositDollar.getDollars(),depositCents);
			//theAccount.deposit(depositDollar);
			theAccount.deposit(depositDollar);
			System.out.println("New Balance is "+theAccount.getBalance());
		}
	}

	private void printBanner(String bannerText) {
		System.out.println("\n###### " + bannerText + " ######\n");
	}

	private String getUserInput(String prompt) {
		System.out.print(prompt + " >>> ");
		return Terminal.readLine();
	}

	public void exit() {
		System.out.println("\n***Exiting...Have a nice day.***");
		System.exit(0);
	}
}
