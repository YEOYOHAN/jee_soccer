<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h2><a id="btn2" href="#">2. 포지션 종류 보기</a></h2>
<h2>4. 포지션 찾기</h2>
<form id="btn4" action="<%=request.getContextPath()%>/player.do">
	팀ID <input type="text" name="teamId"/><br />
	포지션 <input type="text" name="position"/><br />
	<input type="hidden" name="action" value="find4"/>
	<input type="hidden" name="page" value="4_find_position"/>
	<input type="submit" value="이동"/>
</form>
<!-- 4. 팀아이디로 해당팀의 포지션별 선수 검색기능 예 -->
<h2>5. 팀아이디 키 이름 찾기</h2>
<form id="btn5" action="<%=request.getContextPath()%>/player.do">
	팀ID<input type="text" name="teamId"/><br />
	키<input type="text" name="height"/><br />
	이름<input type="text" name="player_name"/><br />
	<input type="hidden" name="action" value="find5"/>
	<input type="hidden" name="page" value="5_find_TeamId_Height_Name"/>
	<input type="submit" value="이동"/>
</form>
<script>
$('#btn2').click(function(){
	alert('클릭');
	location.assign('<%=request.getContextPath()%>/player.do?action=find2&page=2_positions');
});
$('#btn4').submit(function() {
	alert('이동함')
});
$('#btn5').submit(function() {
	alert('이동')
})
</script>
</body>
</html>