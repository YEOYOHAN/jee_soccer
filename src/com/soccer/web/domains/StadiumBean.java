package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class StadiumBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String Stadium_Id, hometeam_Id, set_Count, address, ddd, tel, stadium_Name;
}
