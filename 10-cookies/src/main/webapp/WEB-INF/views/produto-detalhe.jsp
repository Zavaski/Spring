<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${produto.nome}</h1>
	<c:url value="/imagens/${produto.id}.jpg" var="imagens">
	</c:url>
	<img src="${imagens}" />
	<p>
		<fmt:formatNumber value="${produto.preco}" type="currency" />
	</p>
	<form action="../carrinho-compra" method="POST">
		<input type="submit" value="Comprar"> 
		<input type="hidden" name="produtoId" value="${produto.id}"/>
	
	</form>
</body>
</html>