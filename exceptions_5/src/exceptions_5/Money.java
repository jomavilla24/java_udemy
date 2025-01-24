/*
 * This object represent money. Money has a  and a currency Type (USD, EUR, SOL, etc) 
 * */
package exceptions_5;

public class Money {
	public int amount;
	public String currencyType;
	
	public Money(int amount, String currencyType) {
		super();
		this.amount = amount;
		this.currencyType = currencyType;
	}
	
}
