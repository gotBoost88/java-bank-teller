
public class DollarAmount {
	private long totalAmountInCents;
	int cents;
	long dollars;
	
	public DollarAmount (long totalAmountInCents) {
		this.totalAmountInCents = totalAmountInCents;
	}
	public DollarAmount(long dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
		this.totalAmountInCents = this.dollars*100 + this.cents;
	}
	public int getCents() {
	return (int) (totalAmountInCents % 100);
	}
	// 123
	// 23
	public long getDollars() {
		return totalAmountInCents / 100;
	}
	public boolean isEqualTo(DollarAmount amountToCompare) {
		return this.totalAmountInCents == amountToCompare.totalAmountInCents;
	}
	public boolean isLessThan(DollarAmount amountToCompare) {
		return this.totalAmountInCents < amountToCompare.totalAmountInCents;
	}
	public boolean isGreaterThan(DollarAmount amountToCompare) {
		return this.totalAmountInCents > amountToCompare.totalAmountInCents;
	}
	public boolean isNegative() {
		return (totalAmountInCents < 0);
	}
	public DollarAmount plus(DollarAmount amountToAdd) {
		//DollarAmount bagOfMoney = new DollarAmount(0);
		 long dollars = amountToAdd.getDollars();
		 int cents = amountToAdd.getCents();
		 long myDollars = this.getDollars();
		 int myCents = this.getCents();
		 return new DollarAmount (dollars+myDollars, cents+myCents);
	}
	public DollarAmount minus(DollarAmount amountToSubtract) {
		long dollars = amountToSubtract.getDollars();
		int cents = amountToSubtract.getCents();
		long myDollars = this.getDollars();
		int myCents = this.getCents();
		return new DollarAmount (myDollars - dollars, myCents - cents);
		
	}
}
	