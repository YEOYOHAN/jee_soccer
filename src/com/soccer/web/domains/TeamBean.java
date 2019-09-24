package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeamBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String team_Id, region_Name, team_Name, e_Team_Name,
			orig_Yyyy, zip_Code1, zip_Code2, address, ddd, tel,
			fax, homepage, owner;
}
