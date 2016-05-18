<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loja Virtual</title>
</head>
<body>
<h1>Lista de Produtos</h1>
<c:choose>
	<c:when test="${empty cookie['nome']}">
		<p><a href="usuario">Informe seu nome</a></p>
	</c:when>
	<c:otherwise>
		<p>Seja bem vindo(a) ${cookie['nome'].value}</p>
	</c:otherwise>

</c:choose>

<ul>
	<c:forEach items="${produtos}" var="produto">
		<li><a href="detalhe/${produto.id}">${produto.nome}</a></li>
	</c:forEach>
</ul>
</body>
</html>