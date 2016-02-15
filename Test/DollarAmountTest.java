
import org.junit.Assert;
import org.junit.Test;

public class DollarAmountTest {
	
	@Test
	public void getDollars_returns_the_number_of_whole_dollars () {
		DollarAmount anAmount = new DollarAmount(1234);
		long numberOfDollars = anAmount.getDollars();
		Assert.assertEquals(12, numberOfDollars);
	}
	@Test
	public void getCents_returns_the_number_of_cents () {
		DollarAmount anAmount = new DollarAmount(1234);
		long numberOfCents = anAmount.getCents();
		Assert.assertEquals(34, numberOfCents);

	}
	@Test
	public void isGreaterThan_returns_true_for_lesser_amounts() {
		
		DollarAmount firstAmount = new DollarAmount(1234);
		DollarAmount secondAmount = new DollarAmount(1233);
		Assert.assertTrue(firstAmount.isGreaterThan(secondAmount));
		
	}
	@Test
	public void isGreaterThan_returns_false_for_greater_amounts() {
		
		DollarAmount firstAmount = new DollarAmount(1233);
		DollarAmount secondAmount = new DollarAmount(1234);
		Assert.assertFalse(firstAmount.isGreaterThan(secondAmount));
	}
	@Test
	public void isNegative_returns_true_for_amounts_less_than_zero() {
		DollarAmount negativeAmount = new DollarAmount(-1234);
		Assert.assertTrue(negativeAmount.isNegative());
	}
	@Test
	public void isNegative_returns_false_for_amounts_more_than_zero() {
		DollarAmount negativeAmount = new DollarAmount(1234);
		Assert.assertFalse(negativeAmount.isNegative());
	}
	@Test
	public void isLessThan_returns_true_for_greater_amounts() {
		
		DollarAmount firstAmount = new DollarAmount(1233);
		DollarAmount secondAmount = new DollarAmount(1234);
		Assert.assertTrue(firstAmount.isLessThan(secondAmount));
	}
	@Test
	public void isLessThan_returns_false_for_lesser_amounts() {
		
		DollarAmount firstAmount = new DollarAmount(1234);
		DollarAmount secondAmount = new DollarAmount(1233);
		Assert.assertFalse(firstAmount.isLessThan(secondAmount));
	}
	@Test
	public void plus_returns_a_DollarAmount_plus_another_DollarAmount() {
		DollarAmount initialAmount = new DollarAmount(10,00);
		DollarAmount addAmount = new DollarAmount(5,00);
		DollarAmount expectedAmount = new DollarAmount(15,00);
		Assert.assertEquals(expectedAmount, initialAmount.plus(addAmount));
	}
	@Test
	public void minus_returns_a_DollarAmount_minus_another_DollarAmount() {
		DollarAmount initialAmount = new DollarAmount(10,00);
		DollarAmount addAmount = new DollarAmount(5,00);
		DollarAmount expectedAmount = new DollarAmount(5,00);
		Assert.assertEquals(expectedAmount, initialAmount.minus(addAmount));
	}
	@Test
	public void equals_returns_true_for_equal_DollarAmounts () {
		DollarAmount firstAmount = new DollarAmount(5,00);
		DollarAmount secondAmount = new DollarAmount(5,00);
		Assert.assertTrue(firstAmount.isEqualTo(secondAmount));
	}
	@Test
	public void equals_returns_false_for_unequal_DollarAmounts () {
		DollarAmount firstAmount = new DollarAmount(9,00);
		DollarAmount secondAmount = new DollarAmount(5,00);
		Assert.assertFalse(firstAmount.isEqualTo(secondAmount));
	}
	@Test
	public void compare_returns_one_if_comparison_number_is_less_than_another_amount_to_compare () {
		DollarAmount firstAmount = new DollarAmount(9,00);
		DollarAmount secondAmount = new DollarAmount(5,00);
		Assert.assertEquals(1, firstAmount.compareTo(secondAmount));
	}
	@Test
	public void compare_returns_zero_if_comparison_number_is_equal_to_another_amount_to_compare () {
		DollarAmount firstAmount = new DollarAmount(17,00);
		DollarAmount secondAmount = new DollarAmount(17,00);
		Assert.assertEquals(0, firstAmount.compareTo(secondAmount));
	}
	@Test
	public void compare_returns_negative_if_comparison_number_is_greater_than_another_amount_to_compare () {
		DollarAmount firstAmount = new DollarAmount(3,00);
		DollarAmount secondAmount = new DollarAmount(25,00);
		Assert.assertEquals(-1, firstAmount.compareTo(secondAmount));
	}
	@Test
	public void booleanEquals_returns_true_for_equal_DollarAmounts () {
		DollarAmount firstAmount = new DollarAmount(5,00);
		DollarAmount secondAmount = new DollarAmount(5,00);
		Assert.assertTrue(firstAmount.equals(secondAmount));
	}
	@Test
	public void booleanEquals_returns_false_for_unequal_DollarAmounts () {
		DollarAmount firstAmount = new DollarAmount(5,00);
		DollarAmount secondAmount = new DollarAmount(33,00);
		Assert.assertFalse(firstAmount.equals(secondAmount));
	}
	@Test
	public void booleanEquals_returns_false_for_null_DollarAmounts () {
		DollarAmount firstAmount = new DollarAmount(4,00);
		DollarAmount secondAmount = null;
		Assert.assertFalse(firstAmount.equals(secondAmount));
	}
}



