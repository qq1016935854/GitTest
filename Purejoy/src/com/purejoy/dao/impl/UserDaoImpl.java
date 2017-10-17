package com.purejoy.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.purejoy.dao.UserDao;
import com.purejoy.utils.C3P0Utils;

public class UserDaoImpl implements UserDao {
	private final static Logger LOG = LogManager.getLogger(UserDaoImpl.class);

	@Override
	public String login(String username, String password) throws SQLException, JSONException {
		// TODO Auto-generated method stub
		Connection conn = C3P0Utils.getConnection();
		String sql="select * from user where username=? and password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			ResultSetMetaData data = rs.getMetaData();
			int count = data.getColumnCount();
			JSONObject object = new JSONObject();
			object.put("msg", "success");
			for (int i = 1; i <= count; i++) {
				object.put(data.getColumnName(i), rs.getString(i));
			}
			return object.toString();
		}
		
		
		return null;
		
	}
}
