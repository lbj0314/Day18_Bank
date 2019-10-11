package com.iu.bank;

import java.sql.Connection;

import com.iu.controller.FrontController;
import com.iu.controller.MemberController;
import com.iu.member.MemberDAO;
import com.iu.member.MemberDTO;
import com.iu.util.DBConnector;

public class BankMain {

	public static void main(String[] args) {
		MemberController mc = new MemberController();
		mc.start();
		
		
	
	
	}

}
