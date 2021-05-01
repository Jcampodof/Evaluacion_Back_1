<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formularios Evaluación: PRODUCTOS</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
</head>
<body>
	<div>
		<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
			<a class="navbar-brand"	href="#prod">Productos</a> 
			<a class="navbar-brand" href="#user">Usuarios</a> 
			<a class="navbar-brand" href="#vent">Ventas</a>
		</nav>
	</div>
	<div class="container mt-5">

		<div class="row">

			<div class="col-sm" id="prod">
				<h2>Agregar Producto:</h2>

				<form action="/productos" method="POST">

					<label for="id">ID: </label>
					<div class="form-group">
						<input type="number" id="id" name="id" placeholder="Id Producto">
					</div>

					<label for="nombre">Nombre: </label>
					<div class="form-group">
						<input type="text" id="nombre" name="nombre"
							placeholder="Nombre Producto">
					</div>

					<label for="precio">Precio: </label>
					<div class="form-group">
						<input type="number" id="precio" name="precio">
					</div>

					<label for="descripcion">Descripción: </label>
					<div class="form-group">
						<input type="text" id="descripcion" name="descripcion"
							placeholder="detalle producto">
					</div>
					<input type="submit" value="Agregar"
						class="btn btn-block btn-outline-primary">
				</form>

			</div>
			<div class="col-sm"></div>

			<div class="col-sm">
				<h2>Modificar Producto:</h2>
				<form action="/productos/modificar" method="POST">
					<label for="id">ID: </label>
					<div class="form-group">
						<input type="text" id="id" name="id" placeholder="Id Producto">
					</div>
					<label for="nombre">Nombre: </label>

					<div class="form-group">
						<input type="text" id="nombre" name="nombre"
							placeholder="Nombre Producto">
					</div>
					<label for="precio">Precio: </label>

					<div class="form-group">
						<input type="number" id="precio" name="precio" placeholder=" ">
					</div>
					<label for="descripcion">Descripción: </label>

					<div class="form-group">
						<input type="text" id="descripcion" name="descripcion"
							placeholder="detalle producto">
					</div>
					<input type="submit" value="Modificar"
						class="btn btn-block btn-outline-primary">
				</form>
			</div>

		</div>

	</div>




	<br>
	<hr>
	<hr>
	
		<!-- USUARIOS -->
	<div class="container mt-5">

		<div class="row">

			<div class="col-sm" id="user">
				<h2>Datos Usuario:</h2>

				<form action="/usuarios" method="POST">

					<label for="idu">ID: </label>
					<div class="form-group">
						<input type="number" id="idu" name="idu" placeholder="Id Usuario">
					</div>

					<label for="nombreu">Nombre: </label>
					<div class="form-group">
						<input type="text" id="nombreu" name="nombreu"
							placeholder="Nombre Usuario">
					</div>

					<label for="passu">Password: </label>
					<div class="form-group">
						<input type="password" id="passu" name="passu">
					</div>

					<label for="correou">E-Mail: </label>
					<div class="form-group">
						<input type="text" id="correou" name="correou"
							placeholder="example@formu.com">
					</div>

					<label for="edadu">Edad: </label>
					<div class="form-group">
						<input type="number" id="edadu" name="edadu">
					</div>
					<input type="submit" value="Agregar"
						class="btn btn-block btn-outline-primary">
				</form>

			</div>
			<div class="col-sm"></div>

			<div class="col-sm">
				<h2>Modificar Usuario:</h2>
				<form action="/usuarios/modificar" method="POST">

					<label for="id">ID: </label>
					<div class="form-group">
						<input type="number" id="id" name="id" placeholder="Id Usuario">
					</div>

					<label for="nombre">Nombre: </label>
					<div class="form-group">
						<input type="text" id="nombre" name="nombre"
							placeholder="Nombre Usuario">
					</div>

					<label for="pass">Password: </label>
					<div class="form-group">
						<input type="password" id="pass" name="pass">
					</div>

					<label for="correo">E-Mail: </label>
					<div class="form-group">
						<input type="text" id="correo" name="correo"
							placeholder="example@formu.com">
					</div>

					<label for="edad">Edad: </label>
					<div class="form-group">
						<input type="number" id="edad" name="edad">
					</div>
					<input type="submit" value="Modificar"
						class="btn btn-block btn-outline-primary">
				</form>
			</div>

		</div>

	</div>


	<!-- VENTAS -->
	<br>
	<hr>
	<hr>
	<div class="container mt-5">

		<div class="row">
			<div class="col-sm" id="vent">
				<h2>Agregar Venta:</h2>
				<form action="/ventas" method="POST">

					<label for="id">ID: </label>
					<div class="form-group">
						<input type="number" id="id" name="id" placeholder="Id Venta">
					</div>

					<label for="producto">Producto: </label>
					<div class="form-group">
						<input type="text" id="producto" name="producto"
							placeholder="Nombre Producto">
					</div>

					<label for="monto">Monto: </label>
					<div class="form-group">
						<input type="number" id="monto" name="monto">
					</div>

					<label for="descripcion">Descripción: </label>
					<div class="form-group">
						<input type="text" id="descripcion" name="descripcion"
							placeholder="detalle venta">
					</div>
					<input type="submit" value="Agregar"
						class="btn btn-block btn-outline-primary">
				</form>
			</div>
		
		<br>
		<hr>
		<div class="col-sm"></div>

		<div class="col-sm">
			<h2>Modificar Venta:</h2>
			<form action="/ventas/modificar" method="POST">

				<label for="id">ID: </label>
				<div class="form-group">
					<input type="number" id="id" name="id" placeholder="Id Venta">
				</div>

				<label for="producto">Producto: </label>
				<div class="form-group">
					<input type="text" id="producto" name="producto"
						placeholder="Nombre Producto">
				</div>

				<label for="monto">Monto: </label>
				<div class="form-group">
					<input type="number" id="monto" name="monto">
				</div>

				<label for="descripcion">Descripción: </label>
				<div class="form-group">
					<input type="text" id="descripcion" name="descripcion"
						placeholder="detalle venta">
				</div>
				<input type="submit" value="Agregar"
					class="btn btn-block btn-outline-primary">
			</form>
		</div>
		</div>
	</div>

	<br>
	<hr>
</body>
</html>