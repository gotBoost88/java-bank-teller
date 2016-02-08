
public class BankTellerTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DollarAmount amount1 = new DollarAmount (123);
		DollarAmount amount2 = new DollarAmount (456);
		if(amount1.isNegative()) {
			System.out.println("Is Negative.");	
		}
		else {
			System.out.println("Is Positive.");
		}
	
		//System.out.println("amount1 cents "+amount1.getCents());
		DollarAmount amount3 = amount1.plus(amount2);
		System.out.println("Amount1 + Amount 2 ="+amount3.getDollars() + amount3.getCents());
		System.out.println("Pass");	
		
		DollarAmount amount4 = amount2.minus(amount1);
		System.out.println("Amount 2 - Amount 1 ="+amount4.getDollars() + amount4.getCents());
		System.out.println("Pass");
	}
	
}		
	
