package com.iu.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.accountInfo.AccountInfoDAO;
import com.iu.accountInfo.AccountInfoDTO;
import com.iu.bankView.AccountInfoView;

public class AccountInfoController {

	private Scanner sc;
	private AccountInfoDAO accountInfoDAO;
	private AccountInfoView accountInfoView;

	public AccountInfoController(){
		sc = new Scanner(System.in);
		accountInfoDAO = new AccountInfoDAO();
		accountInfoView = new AccountInfoView();
	}

	public void start() {
		boolean check = true;
		int select = 0;
		AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
		while(check) {
			System.out.println("1. 입출금 내역 조회");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 종료");
			select = sc.nextInt();

			switch (select) {
			case 1:
				try {
					ArrayList<AccountInfoDTO> ar = accountInfoDAO.incomeSelect(accountInfoDTO);
					accountInfoView.view(ar);
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:

				break;
			case 3:

				break;
			default:
				check = !check;
			}



		}

	}
}
