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
}
