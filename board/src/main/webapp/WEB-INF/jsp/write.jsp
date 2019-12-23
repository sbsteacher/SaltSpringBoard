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
		<form action="write.do" method="post" id="frm" onsubmit="return chk()">
			<div>제목 : <input type="text" name="title"></div>
			<div>내용 
				<textarea rows="30" cols="50" name="ct"></textarea>
			</div>
			<div>
				<input type="submit" value="등록">
				<input type="reset" value="다시쓰기">
			</div>
		</form>
	</div>
	<script>
		function chk() {
			if( frm.title.value == '') {
				alert('제목이 없네유')
				frm.title.focus()
				return false
			} else if (frm.ct.value == '') {
				alert('내용이 없네유')
				frm.ct.focus()
				return false
			}
		}
	</script>
</body>
</html>