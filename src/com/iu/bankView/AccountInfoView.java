package com.iu.bankView;

import java.util.ArrayList;

import com.iu.accountInfo.AccountInfoDTO;

public class AccountInfoView {
	public void view(ArrayList<AccountInfoDTO> ar) {
		System.out.println("거래 번호\t입출금 금액\t잔액\t종류\t거래 날짜");
		for (AccountInfoDTO accountInfoDTO : ar) {
			System.out.print(accountInfoDTO.getTradeNumber());
//			System.out.println(accountInfoDTO.getAccountNumber());
			System.out.print(accountInfoDTO.getIncome());
			System.out.print(accountInfoDTO.getAccountBalance());
			System.out.print(accountInfoDTO.getIncomeKind());
			System.out.println(accountInfoDTO.getTradeDate());
		}
		
		
		
		
	}
}
