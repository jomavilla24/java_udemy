/* ============================ Throwing exceptions ========================
 * We can make our code to throw exceptions whenever we want. Our code can
 * throw a checked exception, in which case the calling method is obligated
 * to handle the exception or to declare in its signature that
 * it is possible that an exception will occur (using the "throws" keyword)
 * */
package exceptions_5;

public class Main {
	
	// Since there's a possibility that the BankAccount class throws an exception
	// of CustomException1 class, we must declare that possibility by using the
	// "throws" keyword
	// Since there's a possibility that the BankAccount class throws an exception
	// of InterruptedException class, we must declare that possibility by using the
	// "throws" keyword
	public static void main(String[] args) throws CustomException1, InterruptedException {
		// The following line will throw an CustomException1 exception because
		// we are not passing
		// BankAccount account1 = new BankAccount("Martin", "USD", 100);
		BankAccount account1 = new BankAccount("Martin", "USD", 100);
		Money money1 = new Money(30, "EUR");
		
		// The following line will throw an exception InterruptedException because we
		// are trying to add money to an account that has different currency type
		account1.addMoney(money1);
	}

}
