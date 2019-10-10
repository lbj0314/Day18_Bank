package com.iu.bankInput;

import java.util.Scanner;

import com.iu.member.MemberDTO;

public class MemberInput {
	//회원가입
	public MemberDTO memberJoin(Scanner sc) {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("id 입력하세요.");
		memberDTO.setId(sc.next());
		System.out.println("pw 입력하세요.");
		memberDTO.setPw(sc.next());
		System.out.println("이름을 입력하세요.");
		memberDTO.setName(sc.next());
		System.out.println("phone을 입력하세요.");
		memberDTO.setName(sc.next());
		System.out.println("email을 입력하세요.");
		memberDTO.setName(sc.next());
		
		return memberDTO;
	}
	
	//로그인
	public MemberDTO memberLogin(Scanner sc) {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("id 입력");
		memberDTO.setId(sc.next());
		System.out.println("pw 입력");
		memberDTO.setPw(sc.next());
		
		return memberDTO;
	}
}
