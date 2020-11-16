<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
		<c:when test="${param.idade>59}">
			<div>SE EH VEIO</div>
		</c:when>
		
		<c:when test="${param.idade<=59 && para.idade>=20}">
			<div> SE EH ADULTO</div>
		</c:when>
		
		<c:otherwise>
			<div> SE EH CRIANCA</div>
		</c:otherwise>				
	</c:choose>

</body>
</html>