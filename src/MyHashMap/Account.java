package MyHashMap;

public class Account
{
	private int accountNumber;
	private String holderName;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	//Depends only on account number
	@Override
	public int hashCode() {
		final int prime = 2;
		int result = (int) (Math.pow(accountNumber + 1, prime) % 10);
		return result;
	}

	//Compare only account numbers
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
	}

}