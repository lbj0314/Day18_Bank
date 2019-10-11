package com.iu.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.member.MemberDTO;
import com.iu.util.DBConnector;

public class AccountDAO {
	//생성
	public int accountCreate(AccountDTO accountDTO) throws Exception{
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		
		con = DBConnector.getConnect();
		String sql = "INSERT INTO account (accountnumber, accountname, accountbalance, id) "
				+ "VALUES (?, ?, ?, ?)";
		
		st = con.prepareStatement(sql);
		st.setString(1, accountDTO.getAccountNumber());
		st.setString(2, accountDTO.getAccountName());
		st.setLong(3, accountDTO.getAccountBalance());
		st.setString(4, accountDTO.getId());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	//조회
	public ArrayList<AccountDTO> accountSelect(String id) throws Exception{
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
//		AccountDTO accountDTO = null;
		ArrayList<AccountDTO> ar = new ArrayList<AccountDTO>();
		
		con = DBConnector.getConnect();
		
		String sql = "SELECT * FROM account "
				+ "WHERE id = ?";
		
		st = con.prepareStatement(sql);
		st.setString(1, id);

		rs = st.executeQuery();
//		AccountDTO accountDTO = null;
		while (rs.next()) {
			AccountDTO accountDTO = new AccountDTO();
			
			accountDTO.setAccountNumber(rs.getString("accountNumber"));
			accountDTO.setAccountName(rs.getString("accountName"));
			accountDTO.setAccountBalance(rs.getLong("accountBalance"));
			accountDTO.setId(rs.getString("id"));
			
			ar.add(accountDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}
	
}
