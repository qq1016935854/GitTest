package com.itqf.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("method");
		Class<? extends BaseServlet> clazz = this.getClass();
		if(name==null){
			name = "index";
		}
		try {
			Method method = clazz.getMethod(name, HttpServletRequest.class,HttpServletResponse.class);
			String path = (String) method.invoke(this,req,resp);
			if(path!=null){
				req.getRequestDispatcher(path).forward(req, resp);;
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

	public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		return "/index.jsp";
	}
	

}
