<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form id="form-1" action="${pageContext.request.contextPath}/ClienteController" method="post">	
		<input type="hidden" name="acao" value="salvar">
		Identificador<br>
		<input type="text" name="id" size="30" readonly="readonly"><br><br>
		

		Nome<br>
		<input type="text" name="nomePesq" size="30"/><br><br>
		
		Estado<br>
		<select name="estadoPesq">
			<option value="">Selecionar</option>
			<option value="PR">Paraná</option>
			<option value="SC">Santa Catarina</option>
			<option value="RS">Rio Grande do Sul</option>
		</select>
		
		<br><br>
		Cidade<br>
		<input type="text" name="cidadePesq"/><br><br>
		
		Endereço<br>
		<input type="text" name="endereco"><br><br>
		
		Usuario<br>
		<input type="text" name="usuario"><br><br>
		
		Senha<br>
		<input type="password" name="senha">
		
		<br><br>
		<input type="submit" value="Salvar">
		<input type="button" value="Voltar" onclick="location.href='../inicio.jsp'">
		<input type="button" value="Novo" onclick="location.href='clienteCrud.jsp'"><br><br>
		
		<table border='1' width="100%">
		<tr>
			<th>Ação</th>
			<th>Nome</th>
			<th>Estado</th>
			<th>Cidade</th>
			<th>Usuario</th>
		</tr>
		
		<tr>
			<td>
				<a href="#">Editar</a>
				<a href="#">Excluir</a>
			</td>
			<td>Usuario teste</td>
			<td>RS</td>
			<td>Porto Alegre</td>
			<td>usuario</td>
		</tr>
		
		</table>
		
				
	</form>
</body>
</html>