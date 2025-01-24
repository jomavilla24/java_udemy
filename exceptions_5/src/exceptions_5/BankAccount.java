package exceptions_5;

public class BankAccount {
	private String belongsTo;
	private String currencyType;
	private int amount;
	
	public BankAccount(String belongsTo, String currencyType, int amount) throws CustomException1 {
		super();
		// Check if we are passing a name to the back account if not
		// throw CustomException1. Since this custom exception extends the Exception class
		// the worse case is assumed and JAVA assumes that this is a checked exception (in
		// other words JAVA assumes that this is not a RuntimeException). Since this is a
		// checked exception we need either to handle the exception via a try-catch statement
		// or to declare the possibility that this method could throw an exception by using the 
		// "throw" keyword
		if (belongsTo == "" || belongsTo == null) {
			throw new CustomException1("You must specify the owner of the account");
		}
		this.belongsTo = belongsTo;
		this.currencyType = currencyType;
		this.amount = amount;
	}
	
	// This method allows you to add money to bank account. If you try to add
	// money with a specific currency type to a bank account with a different
	// currency type, the code will throw an InterruptedException. Since this 
	// is a checked exception this method will have to declare that it is 
	// possible that some time it throws that kind of exception, this is done
	// via the "throws" keyword in the method definition. If we don't want to 
	// use the "throw" keyword we must use the try-catch statement to handle
	// the exception
	public boolean addMoney(Money money) throws InterruptedException {
		if (this.currencyType != money.currencyType) {
			throw new InterruptedException("You are trying money and bank account have different currency type");
		} 
		this.amount = this.amount + money.amount;
		return true;
	}
	
	
	
	
	
}
