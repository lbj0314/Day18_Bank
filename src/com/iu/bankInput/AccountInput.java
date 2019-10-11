package com.iu.bankInput;

import java.util.Calendar;
import java.util.Scanner;

import com.iu.account.AccountDTO;

public class AccountInput {
	public AccountDTO accountCreate(Scanner sc) {
		AccountDTO accountDTO = new AccountDTO();
		Calendar calendar = Calendar.getInstance();
//		System.out.println("계좌번호를 입력하세요.");
		long l = calendar.getTimeInMillis();
		accountDTO.setAccountNumber(String.valueOf(l));
		System.out.println("계좌의 이름을 입력하세요.");
		accountDTO.setAccountName(sc.next());
		accountDTO.setAccountBalance(0);
		accountDTO.getId();
		
		return accountDTO;

	}
	
	public AccountDTO accountInfo(Scanner sc) {
		AccountDTO accountDTO = new AccountDTO();
//		System.out.println("계좌의 번호를 입력하세요.");
//		accountDTO.setAccountName(sc.next());
		
		return accountDTO;
		
	}
	
}
