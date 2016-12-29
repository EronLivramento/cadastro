<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
<style>
body{background-color: #107ef8; color: #ebebeb; box-sizing: border-box;}

h1{
	text-align: center;
	color:#fff;
	font-size: 2em;
	width: 100%;
}

.menu{
	width:30%;
	margin: 0 35%;
	display: inline-block;
}
.menu li{
	display: inline-block;
	list-style: none;
	margin: 5px;
	padding: 7px;
	font-size: 1.3em;
	background-color: #182dba;
}
.menu a{
	text-decoration: none;
	color:#fff;
}
.botao{
	border:none;
	background-color: #182dba;
	padding:5px;
	color:#fff;
	box-sizing: border-box;
}

</style>
	<div class="header">
		<h1>Cadastro de Produtos</h1>
		<ul class="menu">
			<c:url value="/cadastra.jsp" var="urlCadastro"></c:url>
			<li><a style="text-decoration: none;" href = "${urlCadastro }">Cadastrar novo</li>
			<li>
				<form action="executa" method="POST" style="width:100px; margin:0 auto; ">
					<input type="hidden" name="tarefa" value="BuscarTodos" />
					<input  class="botao" type="submit" value="Buscar" />
				</form>
			</li>
		</ul>

	</div>
	
</body>
</html>