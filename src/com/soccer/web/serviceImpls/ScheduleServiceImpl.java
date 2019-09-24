package com.soccer.web.serviceImpls;

import com.soccer.web.services.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService{
	private static ScheduleServiceImpl instance = new ScheduleServiceImpl();
	public static ScheduleServiceImpl getInstance() {
		return instance;
	}
	private ScheduleServiceImpl() {
	}
	
}
