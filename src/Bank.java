import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Customer> customers;
	
	public Bank() {
		customers = new ArrayList<>();
	}
	public void addCustomer(Customer newCustomer) {
		customers.add(newCustomer);
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	/*public String exportFile() {
		String export = null;
		for (Customer cust : this.getCustomers()) {
			System.out.println(("C|"+ cust.getName() + "|"+cust.getAddress()+"|"+cust.getPhoneNumber()));
			export = "C|"+ cust.getName() + "|"+cust.getAddress()+"|"+cust.getPhoneNumber();
		}
			return export;	
			for (BankAccount theAccount : this.getAccounts()) {
				System.out.println((this.getAccounts().indexOf(theAccount) + 1) + ") " + theAccount.getAccountType() + " "
						+ theAccount.getAccountNumber());
	
	
	public void displayBank(){
		for(Customer cust : getCustomers()){
		System.out.println("1) "+getCustomers());
		System.out.println();
		}
*/		
	}

