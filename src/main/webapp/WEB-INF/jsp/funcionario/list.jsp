<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<title>Lista de Funcionários</title>
</head>
<body>
	<h1>Lista de Funcionários</h1>
	<a href="form" class="btn btn-success btn-lg active" role="button">Novo Funcionário</a><br /><br />
	<table class="table table-striped">
		<thead>
			<th>Id</th>
			<th>Nome</th>
			<th>Telefone</th>
			<th>Ação</th>
		</thead>
		<tbody>
			<c:forEach items="${funcionarioList}" var="funcionario">
				<tr>
					<td>${funcionario.id}</td>
					<td>${funcionario.nome}</td>
					<td>${funcionario.telefone}</td>
					<td>
						<a href="form/${funcionario.id}" class="btn btn-info btn-default active" role="button">Editar Funcionário</a>
						<a href="deletar/${funcionario.id}" class="btn btn-danger btn-default active" role="button">Excluir Funcionário</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>