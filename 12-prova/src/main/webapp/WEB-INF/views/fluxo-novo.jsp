<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Fluxo </title>
<style>
label, input[type=submit] {
	display: block;
}
</style>
</head>
<body>
	<form:form modelAttribute="fluxomv">
		

		<form:label path="fluxo.dataLancamento">Data de Nascimento:</form:label>
		<form:input path="fluxo.dataLancamento" type="date"/>
		<form:errors path="fluxo.dataLancamento"></form:errors>
		
		<form:label path="fluxo.descricao">Descrição:</form:label>
		<form:input path="fluxo.descricao" />
		<form:errors path="fluxo.descricao"></form:errors>
		
		<form:label path="fluxo.valor">Valor:</form:label>
		<form:input path="fluxo.valor" />
		<form:errors path="fluxo.valor"></form:errors>
		
		<form:label path="fluxo.tipo">Tipo:</form:label>
		<form:checkbox path="fluxo.tipo"	value="Entrada" >Entrada</form:checkbox>
		<form:checkbox path="fluxo.tipo"	value="Saída" >Saída</form:checkbox>
		
		<input type="submit" value="salvar" />
	</form:form>
	

</body>
</html>