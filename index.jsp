 <html>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"> 

<body>

<div >
<h2 >AGREGAR DATOS</h2>
</div>

<form action="ServeleteControler" method="post">
<table align="center">
<thead>
	
</thead>
<tbody>
	<tr>
	<td>
			<p>id</p><input type="text" name="id">
			<p>Nombre producto</p><input type="text" name="Nproductos">
			<p>Precio producto</p><input type="text" name="Pproductos">
			<p>Cantidad de producto</p><input type="text" name="Cproductos">
			<p>Total de producto</p><input type="text" name="Tproductos">
			<br>
			<br>
			

		
	</td>	
	</tr>
</tbody>	
</table>

<input type="submit" name="btn" value="agregar">
<input type="submit" name="btn" value="eliminar">
<input type="submit" name="btn" value="modificar">




</form>
</body>
</html>
