package com.soccer.web.services;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {
	// 2. 포지션 종류(중복제거,없으면 빈공간)
	public List<String> findPositions();
	// 4. 수원팀(ID: K02)골키퍼
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param);
	// 5. 5. 팀아이디 키 이름 찾기
	public List<PlayerBean> findByTeamIdHeightPlayer_Name(PlayerBean param);
	
}
