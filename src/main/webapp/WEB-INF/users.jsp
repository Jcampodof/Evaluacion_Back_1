<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formularios Evaluación: USUARIOS</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
    integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
    crossorigin="anonymous">
</head>
<body>

	
	<div class="container mt-5">
		<h2>Datos Usuario: </h2>
		<form action="/usuarios" method="POST">
			<label for="idu">ID: </label> 
			<input type="number" id="idu"	name="idu" placeholder="Id Usuario"> 
			<label for="nombreu">Nombre: </label> 
			<input type="text" id="nombreu"	name="nombreu" placeholder="Nombre Usuario"> 
			<label for="passu">Password: </label> 
			<input type="password" id="passu" name="passu" placeholder="******"> 
			<label for="correou">E-Mail: </label>
			<input type="text" id="correou" name="correou" placeholder="example@user.com">
			<label for="edadu">Edad: </label>
			<input type="number" id="edadu" name="edadu" placeholder=" ">
			<input type="submit" value="Agregar">
		</form>
	</div>
	<br>
	<hr>
	
		<div class="container mt-5">
		<h2>Modificar Datos Usuario: </h2>
		<form action="/usuarios/modificar" method="POST">
			<label for="id">ID: </label> 
			<input type="text" id="id"	name="id" placeholder="Id Usuario">
			<label for="nombre">Nombre: </label> 
			<input type="text" id="nombre"	name="nombre" placeholder="Nombre Usuario"> 
			<label for="pass">Password: </label> 
			<input type="password" id="pass" name="pass" placeholder="******"> 
			<label for="correo">E-Mail: </label>
			<input type="text" id="correo" name="correo" placeholder="example@user.com">
			<label for="edad">Edad: </label>
			<input type="number" id="edad" name="edad" placeholder=" ">
			<input type="submit" value="Modificar">
		</form>
	</div>
	<br>
	<hr>

	<hr>

</body>
</html>