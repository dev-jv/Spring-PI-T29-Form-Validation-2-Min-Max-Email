<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmacion de Registro de Estudiantes</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/styles4.css"><link>
</head>
<body>

El alumno: <br/>

- <strong>${estudianteX.nombre}</strong>, <strong>${estudianteX.apellidos}</strong><br/>
- <strong>${estudianteX.edad}</strong> años<br/>
- <strong>${estudianteX.email}</strong><br/>
    Se ha registrado con exito!

	<br/><br/>

Las asignaturas a las que se inscribió son: <strong>${estudianteX.optativa}</strong>

	<br/><br/>

La provincia donde iniciará sus estudios será: <strong>${estudianteX.ciudadEstudios}</strong>

	<br/><br/>
	
Los idiomas que eligió son: <strong>${estudianteX.idiomas}</strong>

</body>
</html>