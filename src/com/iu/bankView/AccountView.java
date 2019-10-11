package com.iu.bankView;

import java.util.ArrayList;

import com.iu.account.AccountDTO;

public class AccountView {
	public void view(ArrayList<AccountDTO> ar) {
		System.out.println("계좌 번호\t\t계좌 이름\t잔액");
		for (AccountDTO accountDTO : ar) {
			
			System.out.print(accountDTO.getAccountNumber() + "\t");
			System.out.print(accountDTO.getAccountName() + "\t");
			System.out.println(accountDTO.getAccountBalance());
			
		}
	}
}
