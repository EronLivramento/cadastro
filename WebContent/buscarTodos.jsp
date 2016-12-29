<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Resultado da busca</title>
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
		table{
		border:1px solid #fff;
		padding: 10px;
		width: 60%;
		margin: 20px 20%;
		}	
		td{
			padding:10px;
		}	
	</style>
	<h1>Todos os produtos cadastrados</h1>
	<div class="principal">
		<table>
			<thead>
				<tr>
				<td>id</td>
				<td>nome</td>
				<td>preco</td>
				<td>descricao</td>
				</tr>
			</thead>
			<tbody>
				
				<c:forEach var="produto" items="${produtos}">
					<tr>
					<td>${produto.id}</td>
					<td>${produto.nome}</td>
					<td>${produto.preco}</td>
					<td>${produto.descricao}</td>
					</tr>
				</c:forEach>
					
				
			</tbody>
		</table>
	</div>
</body>
</html>