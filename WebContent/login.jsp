<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SysLocadora1 - Sisnema </title>
</head>
<body>
	<h1>Syslocadora - Pessoas</h1>
	<hr>
	<form id="form-1" action="./LoginController" method="post">
		Usuario <br>
		<input type='text' name="usuario" required="required"
		placeholder="Login de acesso"
		maxlength="8" title="Login com letras e numeros. Maximo 8 caracteres."/>
		<br/><br/>
		
		Senha<br/>
		<input type="password" name="senha" required="required" 
		placeholder="Senha de acesso" maxlength="8" title="Senha com letras e numeros. Maximo 8 caracteres."
		/>
		<br/><br/>
		
		<input type="submit" value="Logar">
	</form>
</body>
</html>