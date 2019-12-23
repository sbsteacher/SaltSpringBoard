<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
<style type="text/css">
	.pointer {
		cursor: pointer;
	}
</style>
</head>
<body>
	<div id="container">
		<div>
			<a href="write.do"><button>글쓰기</button></a>
		</div>
		<div>
			<table>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>조회수</th>
					<th>작성일</th>					
				</tr>
				<c:forEach var="item" items="${list}">
					<tr onclick="moveToDetail(${item.i_board })" class="pointer">
						<td>${item.i_board }</td>
						<td>${item.title }</td>
						<td>${item.cnt }</td>
						<td>${item.r_dt }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div>
			-- 페이징
		</div>
	</div>
	<script>
		function moveToDetail(i_board) {
			location.href = 'detail?i_board=' + i_board
		}
	
	</script>
</body>
</html>