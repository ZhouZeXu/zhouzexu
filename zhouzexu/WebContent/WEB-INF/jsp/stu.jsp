<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	function ajaxdel(sid){
			$.ajax({
					url:'delete?sid='+sid,
					type:'get',
					success:function(data){
					if(data==1){
						$("#"+sid).remove();
					}
				}
			});
		}
</script>
<body>
	<table border="1" cellspacing="0" align="center" width="500px" style="text-align: center;border:1px solid red">
		<tr>
		<td>${u.uname }</td>
		</tr>
		<tr>
			<td>编号</td>
			<td>名字</td>
			<td>性别</td>
			<td>年龄</td>
			<td>电话</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${slist}" var="slist">
			<tr id="${slist.sid }">
				<td>${slist.sid }</td>
				<td>${slist.sname }</td>
				<td>${slist.ssex }</td>
				<td>${slist.sage }</td>
				<td>${slist.stel }</td>
			<td>
				<a href="javascript:ajaxdel(${slist.sid })">删除</a>
				<a href="SelOne?sid=${slist.sid }">修改</a>
			</td>
			</tr>
		</c:forEach>
			<tr>
				<td><a href="toadd">添加</a></td>
			</tr>
	</table>
</body>
</html>