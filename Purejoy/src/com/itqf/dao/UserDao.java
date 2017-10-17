package com.itqf.dao;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONException;

public interface UserDao {

	String login(String username, String password) throws SQLException, JSONException;

}
