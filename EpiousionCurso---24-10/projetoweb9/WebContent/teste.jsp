<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	   Date d = new Date();
	%>
	
	<%=d %>
	
	<c:if test="${d.getMonth()==9}">
		<div>
		    java hater
		</div>
	</c:if>
	
	<c:if test="${d.getMonth()!=9}">
		<div>
		    java lover
		</div>
	</c:if>

</body>
</html>