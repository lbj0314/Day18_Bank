package com.iu.account;

public class AccountDTO {
	private long accountNumber;
	private String accountName;
	private int accountBalance;
	private String id;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long l) {
		this.accountNumber = l;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
