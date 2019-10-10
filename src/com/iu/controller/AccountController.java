package com.iu.controller;

import java.util.Scanner;

import com.iu.account.AccountDAO;
import com.iu.account.AccountDTO;
import com.iu.bankInput.AccountInput;
import com.iu.bankView.BankView;

public class AccountController {
	private Scanner sc;
	private AccountDAO accountDAO;
	private AccountInput accountInput;
	private BankView bankView;

	public AccountController(){
		sc = new Scanner(System.in);
		accountDAO = new AccountDAO();
		accountInput = new AccountInput();
		bankView = new BankView();
	}

	public void start() {
		boolean check = true;
		int select = 0;
		AccountDTO accountDTO = new AccountDTO();
		while (check) {
			System.out.println("1. 계좌등록");
			System.out.println("2. 계좌정보조회");
			System.out.println("3. 종료");
			select = sc.nextInt();
			accountDAO = new AccountDAO();
			accountDTO = null;
			switch (select) {
			case 1:
				accountDTO = accountInput.accountCreate(sc);
				try {
					select = accountDAO.accountCreate(accountDTO);
				} catch (Exception e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					select = 0;
				}
				String msg = "Account Create Fail";
				if (select > 0) {
					msg = "Account Create Success";
				}
				bankView.view(msg);
				break;
			case 2:
				accountDTO = accountInput.accountInfo(sc);
				String msg2 = "계좌 정보를 출력합니다.";
				bankView.view(msg2);
				
				break;
			default:
				check =! check;
				
			}

		}
	}

}
