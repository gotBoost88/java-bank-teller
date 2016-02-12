//import com.techelevator.bank.DollarAmount;

public class DollarAmount {
	private long totalAmountInCents;
	public static final DollarAmount ZERO_DOLLARS = new DollarAmount(0);
	
	public DollarAmount (long totalAmountInCents) {
		this.totalAmountInCents = totalAmountInCents;
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
		return new DollarAmount(this.totalAmountInCents + amountToAdd.totalAmountInCents);//DollarAmount bagOfMoney = new DollarAmount(0);
	}
	public DollarAmount minus(DollarAmount amountToSubtract) {
		return new DollarAmount(this.totalAmountInCents - amountToSubtract.totalAmountInCents);
		
	}
}
	