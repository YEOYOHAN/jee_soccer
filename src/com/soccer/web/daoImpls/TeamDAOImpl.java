package com.soccer.web.daoImpls;

import com.soccer.web.daos.TeamDAO;

public class TeamDAOImpl implements TeamDAO{
	private static TeamDAOImpl instance = new TeamDAOImpl();
	public static TeamDAOImpl getInstance() {
		return instance;
	}
	private TeamDAOImpl() {
	}
}
