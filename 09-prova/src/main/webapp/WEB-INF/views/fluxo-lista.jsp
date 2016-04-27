<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is Sparta!!!</title>
</head>
<body>
	<table border=1>
<CAPTION>Lista de Lançamentos</CAPTION>
<tr>
	<td>Id</td>
	<td>Data</td>
	<td>Histórico</td>
	<td>Tipo<td>
	
</tr>
	<c:forEach items="${fluxos}" var="fluxo">
		
		<td>${fluxo.id}</td>
		<td> ${fluxo.dataLancamento}</td>
		<td>${fluxo.descricao}</td>
		<td>${fluxo.tipo}</td>
	
		
		</tr>
	</c:forEach>
</table>
	
<ul>

</ul>
</body>
</html>