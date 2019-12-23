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
	<div>		
		<div>제목 : ${detail.title }</div>
		<div>조회수 : ${detail.cnt } / 등록일 : ${detail.r_dt }</div>
		<div>내용</div>
		<div>${detail.ct }</div>
		<div><button>수정</button><button onclick="confirmDel()">삭제</button></div>
	</div>
	<script>
		function confirmDel() {
			
		}
	</script>
</body>
</html>