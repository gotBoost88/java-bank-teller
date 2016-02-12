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
		while(true) {
			String choice = getChoiceFromMainMenu();
			if(choice.equals("1")) {
				addCustomer();
				
			} else if(choice.equals("2")){
				printBanner("ADD ACCOUNT\n");
				System.out.println("Choose a customer:\n");
				displayBank();
				
				String customerNumber = getUserInput("Enter customer number\n");
				
				
				System.out.println("1) Checking");
				System.out.println("2) Savings");
				
				String newBankAccountChoice = getUserInput("Enter account type number\n");
				// need a method to create a new checking or savings account
				
				String newAccountNumber = getUserInput("Enter new account number\n");
				// need a method to add the account number to the new account
				
				
				

				
				//addAccount(newBankAccount);
				
			} else if(choice.equals("6")) {
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
		Customer newCustomer = new Customer (name, address, phoneNumber);
		theBank.addCustomer(newCustomer);
		System.out.println("\n*** "+newCustomer.getName()+" added as a customer ***");
	}
	
	public void addAccount(BankAccount newAccount){
		printBanner("ADD ACCOUNT");
		System.out.println("\nChoose a customer:\n");
		
	}
	
		public void displayBank(){
			
			for(Customer cust : theBank.getCustomers()){
				//int count = 0;
		//System.out.println("1) "+theBank.getCustomers());
		//System.out.println("1) "+theBank.getCustomers().indexOf(cust));
		//System.out.println("1) "+theBank.getCustomers().iterator().toString());
		//System.out.println( count+") "+  cust.getName() +" " +cust.getAddress()+" "+cust.getPhoneNumber());
		System.out.println( (theBank.getCustomers().indexOf(cust)+1)+") "+  cust.getName() +" " +cust.getAddress()+" "+cust.getPhoneNumber());
				
		//System.out.println();
		     
		}
			
		
	}
	public void deposit(DollarAmount amountToDeposit) {
		printBanner("DEPOSIT");
	
		
		
	}
	private void printBanner(String bannerText) {
		System.out.println("\n###### "+bannerText+" ######\n");
	}
	

	private String getUserInput(String prompt) {
		System.out.print(prompt+" >>> ");
		return Terminal.readLine();
	}

	public void exit() {
		System.out.println("\n***Exiting...Have a nice day.***");
		System.exit(0);
	}
}
