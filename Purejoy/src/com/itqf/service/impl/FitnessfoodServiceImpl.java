package com.itqf.service.impl;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.itqf.dao.FitnessfoodDao;
import com.itqf.dao.impl.FitnessfoodDaoImpl;
import com.itqf.service.FitnessfoodService;

public class FitnessfoodServiceImpl implements FitnessfoodService {
	private final static Logger LOG = LogManager.getLogger(FitnessfoodServiceImpl.class);

	@Override
	public String getAllFitnessfood() {
		// TODO Auto-generated method stub
		FitnessfoodDao dao = new FitnessfoodDaoImpl();
		
		String json = dao.getAllFitnessfood();
		
		return json;
	}
}
