<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글보기</title>
</head>
<body>
	<div><a href="list.do"><button>리스트로 돌아가기</button></a></div>
	<div>		
		<div>제목 : ${detail.title }</div>
		<div>조회수 : ${detail.cnt } / 등록일 : ${detail.r_dt }</div>
		<div>내용</div>
		<div>${detail.ct }</div>
		<div><button onclick="confirmMod()">수정</button><button onclick="confirmDel()">삭제</button></div>
	</div>
	<script>
		function confirmDel() {
			if(confirm('삭제하시겠습니까')) {
				location.href="delBoard.do?i_board=" + ${detail.i_board}
			}
			
		}
		function confirmMod(){
			location.href="write.do?i_board=" + ${detail.i_board}
		}
	</script>
</body>
</html>