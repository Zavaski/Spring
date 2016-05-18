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
	Cadastro Efetuado com Sucesso!!!
	<table border=1>
<tr>
	<td>id</td>
	<td>Descrição</td>
	<td>Tipo</td>
	<td>Data</td>
</tr>
	<c:forEach items="${fluxos}" var="fluxo">
		<tr>
		<td>${fluxo.id}</td>
		<td>${fluxo.descricao}</td>
		<td>${fluxo.tipo}</td>
		<td> ${fluxo.dataLancamento}</td>
		</tr>
	</c:forEach>
</table>
	
<ul>

</ul>
</body>
</html>