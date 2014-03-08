<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulário de Funcionário</title>
</head>
<body>
	<div style="width:80%; margin-top:20px;">
	    <form class="form-horizontal" role="form" action="<c:url value='/funcionario/salvar'/>" method="post">
	      <input type="hidden" name="funcionario.id" value="${funcionario.id}">
		  <div class="form-group">
		    <label for="inputEmail3" class="col-sm-2 control-label">Nome</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputEmail3" placeholder="Nome" name="funcionario.nome" value="${funcionario.nome}">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="inputPassword3" class="col-sm-2 control-label">Telefone</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="inputPassword3" placeholder="Telefone" name="funcionario.telefone" value="${funcionario.telefone}">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">Salvar</button>
		    </div>
		  </div>
		</form>
	</div>
</form>
</body>
</html>