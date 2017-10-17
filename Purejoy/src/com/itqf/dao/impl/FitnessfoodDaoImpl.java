package com.itqf.dao.impl;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;

import com.itqf.bean.Fitnessfood;
import com.itqf.dao.FitnessfoodDao;
import com.itqf.utils.HibernateUtils;

public class FitnessfoodDaoImpl implements FitnessfoodDao {
	private final static Logger LOG = LogManager.getLogger(FitnessfoodDaoImpl.class);

	@Override
	public String getAllFitnessfood() {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtils.getSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Fitnessfood");
		List<Fitnessfood> list = query.list();
		
		JSONArray array = new JSONArray();
		
		for (Fitnessfood fitnessfood : list) {
			JSONObject object = new JSONObject(fitnessfood);
			array.put(object);
		}
		String json = array.toString();
		transaction.commit();
		return json;
	}
}
