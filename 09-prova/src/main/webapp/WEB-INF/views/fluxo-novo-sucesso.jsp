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
<CAPTION>Clientes Cadastrados</CAPTION>
<tr>
	<td>Id</td>
	<td>Nome</td>
	<td>CPF</td>
	<td>Editar</td>
	<td>Deletar</td>
	
</tr>
	<c:forEach items="${clientes}" var="cliente">
		
		<td>${cliente.id}</td>
		<td> ${cliente.nome}</td>
		<td>${cliente.cpf}</td>
		<td>
			<form action="editar" method="post">
				<input type="submit" name="editar_cliente" value="Editar">
				<input type="hidden" name="cliente" value="${cliente}">
			</form>
		</td>
		<td>
			<form action="delete" method="DELETE">
				<input type="submit" name="delete" value="Delete">
				<input type="hidden" name="cliente" value="${cliente.id}">
			</form>
		</td>
		
		</tr>
	</c:forEach>
</table>
	
<ul>

</ul>
</body>
</html>