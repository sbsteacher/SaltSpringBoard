<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기</title>
</head>
<body>
	<div>
		<form action="write" method="post" id="frm">
			<div>제목 : <input type="text" name="title"></div>
			<div>내용 
				<textarea rows="60" cols="40" name="ct"></textarea>
			</div>
		</form>
	</div>
</body>
</html>