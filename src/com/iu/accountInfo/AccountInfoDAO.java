package com.iu.accountInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class AccountInfoDAO {
//	1. 입출금 조회
//	2. 입출금 하기

	public ArrayList<AccountInfoDTO> incomeSelect(AccountInfoDTO accountInfoDTO) throws Exception {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		ArrayList<AccountInfoDTO> ar = new ArrayList<AccountInfoDTO>();
		
		con = DBConnector.getConnect();
		
		String sql = "SELECT * FROM accountInfo "
				+ "WHERE accountnumber = ? ORDER BY tradeNumber DESC";
		
		st = con.prepareStatement(sql);
		st.setString(1, accountInfoDTO.getAccountNumber());
		
		
		rs = st.executeQuery();
		
		while (rs.next()) {
			accountInfoDTO = new AccountInfoDTO();
			
			accountInfoDTO.setTradeNumber(rs.getLong("tradeNumber"));
			accountInfoDTO.setAccountNumber(rs.getString("accountNumber"));
			accountInfoDTO.setIncome(rs.getLong("income"));
			accountInfoDTO.setAccountBalance(rs.getLong("accountBalance"));
			accountInfoDTO.setIncomeKind(rs.getInt("incomeKind"));
			accountInfoDTO.setTradeDate(rs.getDate("tradeDate"));
			
			ar.add(accountInfoDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
	}
	//입출금
	public int income(AccountInfoDTO accountInfoDTO) throws Exception {
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		
		con = DBConnector.getConnect();
		String sql = "INSERT INTO accountInfo "
				+ "VALUES (trade_seq.nextval, ?, ?, ?, ?, sysdate)";
		
		st = con.prepareStatement(sql);
//		st.setLong(1, accountInfoDTO.getTradeNumber());
		st.setString(1, accountInfoDTO.getAccountNumber());
		st.setLong(2, accountInfoDTO.getIncome());
		st.setLong(3, accountInfoDTO.getAccountBalance());
		st.setInt(4, accountInfoDTO.getIncomeKind());
//		st.setDate(5, accountInfoDTO.getTradeDate());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}

}
