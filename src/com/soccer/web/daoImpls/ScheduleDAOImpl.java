package com.soccer.web.daoImpls;

import com.soccer.web.daos.ScheduleDAO;

public class ScheduleDAOImpl implements ScheduleDAO{
	private static ScheduleDAOImpl instance = new ScheduleDAOImpl();
	public static ScheduleDAOImpl getInstance() {
		return instance;
	}
	private ScheduleDAOImpl() {
	}
}
