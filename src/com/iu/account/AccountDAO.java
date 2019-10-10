package com.iu.account;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.iu.util.DBConnector;

public class AccountDAO {
	public int accountCreate(AccountDTO accountDTO) throws Exception{
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		
		con = DBConnector.getConnect();
		String sql = "INSERT INTO account (accountnumber, accountname, accountbalance, id) "
				+ "VALUES (?, ?, ?, ?)";
		
		st = con.prepareStatement(sql);
		st.setLong(1, accountDTO.getAccountNumber());
		st.setString(2, accountDTO.getAccountName());
		st.setInt(3, accountDTO.getAccountBalance());
		st.setString(4, accountDTO.getId());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
}
