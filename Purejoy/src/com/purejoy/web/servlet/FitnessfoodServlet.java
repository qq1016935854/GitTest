package com.purejoy.web.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.purejoy.service.FitnessfoodService;
import com.purejoy.service.impl.FitnessfoodServiceImpl;

public class FitnessfoodServlet extends BaseServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static Logger LOG = LogManager.getLogger(FitnessfoodServlet.class);

	
	public String getFitnessfood(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		FitnessfoodService service = new FitnessfoodServiceImpl();
		
		String json = service.getAllFitnessfood();
		System.out.println(json);
		response.getWriter().write(json);
		return null;
	}
}
