package com.purejoy.service;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONException;

public interface UserService {

	String login(String username, String password) throws SQLException, JSONException;

}
