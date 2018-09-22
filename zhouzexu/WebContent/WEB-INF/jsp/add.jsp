<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

	<form action="add" method="post">
	<table border="1" cellspacing="0" align="center" width="500px" style="text-align: center;border:1px solid red">
		
		<tr>
			<td>
			名字:<input type="text" name="sname" />
			</td>
		</tr>
		<tr>
			<td>
			性别:<input type="text" name="ssex" />
			</td>
		</tr>
		<tr>
			<td>
			年龄:<input type="text" name="sage" />
			</td>
		</tr>
		<tr>
			<td>
			电话:<input type="text" name="stel" />
			</td>
		</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
			</tr>
	</table>
</form>
</body>
</html>