package com.itqf.web.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONException;

import com.itqf.service.UserService;
import com.itqf.service.impl.UserServiceImpl;

public class UserServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static Logger LOG = LogManager.getLogger(UserServlet.class);

	
	
	public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, JSONException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserService service = new UserServiceImpl();
		String json=service.login(username,password);
		System.out.println(json);
		response.getWriter().write(json);
		return null;
	}
}
