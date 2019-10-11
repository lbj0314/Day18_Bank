package com.iu.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.accountInfo.AccountInfoDAO;
import com.iu.accountInfo.AccountInfoDTO;
import com.iu.bankView.AccountInfoView;

public class FrontController {
	
	private Scanner sc;
	private MemberController memberController;
	private AccountController accountController;
	
	public FrontController() {
		sc = new Scanner(System.in);
		memberController = new MemberController();
		accountController = new AccountController();
	}
	
	public void start() {
		boolean check = true;
		int select = 0;
		
		while (check) {
			System.out.println("1. 회원 정보");
			System.out.println("2. 계좌 정보");
			System.out.println("3. 종료");
			select = sc.nextInt();
			switch (select) {
			case 1:
				memberController.start();
				break;
			case 2:
				
				
				break;
				
			default:
				check =! check;
				
			}
			
			
		}
	}
}
