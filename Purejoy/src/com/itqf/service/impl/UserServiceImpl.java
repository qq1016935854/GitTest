package com.itqf.service.impl;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONException;

import com.itqf.dao.UserDao;
import com.itqf.dao.impl.UserDaoImpl;
import com.itqf.service.UserService;

public class UserServiceImpl implements UserService {
	private final static Logger LOG = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public String login(String username, String password) throws SQLException, JSONException {
		// TODO Auto-generated method stub
		UserDao dao = new UserDaoImpl();
		String json = dao.login(username,password);
		return json;
	}
}
