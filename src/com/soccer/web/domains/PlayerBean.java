package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class PlayerBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String team_Id, player_Id, player_name, e_Player_Name, nickname, join_Yyyy,
			position, back_No, nation, birth_Date, solar, height, wehght;

}
