package com.iu.controller;

import java.util.Scanner;

import com.iu.bankInput.MemberInput;
import com.iu.bankView.BankView;
import com.iu.member.MemberDAO;
import com.iu.member.MemberDTO;

public class MemberController {

	private Scanner sc;
//	private MemberDTO memberDTO;
	private MemberDAO memberDAO;
	private MemberInput	memberInput;
	private BankView bankView;


	public MemberController() {

		sc = new Scanner(System.in);
//		memberDTO = new MemberDTO();
		memberDAO = new MemberDAO();
		memberInput = new MemberInput();
		bankView = new BankView();
	}

	public void start() {
		boolean check = true;
		int select = 0;
		MemberDTO memberDTO = new MemberDTO();
		while (check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			select = sc.nextInt();
			memberDAO = new MemberDAO();
			memberDTO = null;
			switch (select) {
			case 1:
				memberDTO = memberInput.memberJoin(sc);
				try {
					select = memberDAO.memberJoin(memberDTO);
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					select = 0;
				}
				String msg = "Member Join Fail";
				if (select > 0) {
					msg = "Member Join Success";
				}
				bankView.view(msg);
				break;
			case 2:
				memberDTO = memberInput.memberLogin(sc);
				try {
					memberDTO = memberDAO.memberLogin(memberDTO);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					memberDTO = null;
				}
				String msg2 = "Login Fail";
				if (memberDTO != null) {
					msg2 = "Login Success";
				}
				bankView.view(msg2);
				break;
			default:
				check =! check;
			}
		}
	}

}




