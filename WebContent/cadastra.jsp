<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='../css/style.css' />" rel="stylesheet" type="text/css" />
<title>Cadastrar novo produto</title>

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
.principal{
	width:40%;
	margin:0 30%;
	border: 1px solid #fff;
	padding: 10px;
}
label{
	display: block;
	margin-top: 10px;
}
.botao{
	background-color: black;
	color: #fff;
	border:none;
	margin-top:10px;
	padding: 10px;
}

</style>
	<h1>Novo Produto</h1>
	<div class="principal">
		<form action="executa" method="POST">
		<input type="hidden" name="tarefa" value="ProdutoNovo" />
		<label>
			nome: <input type="text" name="nome">
		</label>
		<label>
			preco: <input type="number" name="preco">
		</label>
		<label>
			descricao: <input type="text" name="descricao">
		</label>
		<input class="botao" type="submit">
		
		</form>
	</div>
</body>
</html>