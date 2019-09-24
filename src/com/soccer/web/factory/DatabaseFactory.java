package com.soccer.web.factory;

public class DatabaseFactory {
	public static Database createDatabase(String vender) {
		Database db = null;
		switch(vender) {
		case "oracle" :
			db = new Oracle();
			break;
		case "mariadb" :
			db = new Mariadb();
			break;
		case "h2" :
			
			break;
		case "db2" :
			
			break;
		default :
			break;
		}
		return db;
	}
}
