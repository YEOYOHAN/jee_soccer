package com.soccer.web.daoImpls;

import com.soccer.web.daos.StadiumDAO;

public class StadiumDAOImpl implements StadiumDAO{
	private static StadiumDAOImpl instance = new StadiumDAOImpl();
	public static StadiumDAOImpl getInstance() {
		return instance;
	}
	private StadiumDAOImpl() {		
	}
}
