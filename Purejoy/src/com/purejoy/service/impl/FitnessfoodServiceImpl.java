package com.purejoy.service.impl;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.purejoy.dao.FitnessfoodDao;
import com.purejoy.dao.impl.FitnessfoodDaoImpl;
import com.purejoy.service.FitnessfoodService;

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
