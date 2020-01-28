
public class Client {
	private String name;
	private String identificationNumber;

	private long AccountNumber;
	private long AccountBalance; // all the calculations in cents, so we don't need float
	private boolean isAccountActive;
	private long credit; // all the calculations in cents, so we don't need float


	public Client(String name, String identificationNumber) {
		this.name = name;
		this.identificationNumber = identificationNumber;
	}

	// activating bank account
	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
		this.isAccountActive = true;
	}

	// get a nice string with account balance for the report
	public String getAccountBalanceInfo() {
		return "The balance on your account is " + AccountBalance / 100 + " dollars " + AccountBalance % 100
				+ " cents ";
	}

	// dealing with maintenance of the credit line at the end of a month:
	// 10% of the credit sum withdrew from debit account : 5% for credit maintenance
	// and 5% for credit repayments
	public void closeMonth() {
		if (this.credit >= 0) {
			if (this.AccountBalance >= this.credit / 10) {
				this.AccountBalance = this.AccountBalance - this.credit / 10; // 10% of credit withdrawal from account
																				// for credit maintenance and credit
																				// repayments
				this.credit = this.credit - this.credit / 20; // 5% of credit - credit repayments
			} else {
				this.isAccountActive = false;
			}
		}
	}

	// getting new credit: checking if the salary or the balance is sufficient for
	// the payments
	public boolean isNewGetCreditAvailable(long salary, int newCredit) {
		long credit = this.credit + newCredit;
		long paymentFromSalary = (salary * 100) / 30; //30% from the salary
		if (paymentFromSalary >= credit / 10) {
			return true;
		}
		if (this.AccountBalance >= credit) {
			return true;
		}
		return false;
	}

}