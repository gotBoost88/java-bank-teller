
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
		System.out.println()
		
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
	private void printBanner(String prompt) {
		System.out.println("\n###### "+bannerText+" ######\n");
	}

}
