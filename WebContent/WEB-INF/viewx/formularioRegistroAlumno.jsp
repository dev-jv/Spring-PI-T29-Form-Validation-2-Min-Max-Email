<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Estudiantes</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/recursos/css/styles4.css"><link>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="estudianteX">
	
	Nombre: <form:input path="nombre"/><br/><form:errors path = "nombre" style="color:blue"></form:errors>
	
	<br/><br/>
	
	Apellidos: <form:input path="apellidos"/>
	
	<br/><br/>
	
	Edad: <form:input path="edad"/><br/><form:errors path = "edad" style="color:blue"></form:errors>
	
	<br/><br/>
	
	E-mail: <form:input path="email"/><br/><form:errors path = "email" style="color:blue"></form:errors>
	
	<br/><br/>
	
	Asignaturas Optativas: <br>
	
	<br/>
	
	<form:select path="optativa" multiple="true">
	
		<form:option value="Diseño" label="Diseño"></form:option>
		<form:option value="Karate" label="Karate"></form:option>
		<form:option value="Comercio" label="Comercio"></form:option>
		<form:option value="Danza" label="Danza"></form:option>
		<form:option value="Chess" label="Chess"></form:option>
		
	</form:select>
	
	<br/><br/>
	
	Barcelona <form:radiobutton path="ciudadEstudios" value="Barcelona"/>
	Madrid <form:radiobutton path="ciudadEstudios" value="Madrid"/>
	Valencia <form:radiobutton path="ciudadEstudios" value="Valencia"/>
	Bilbao <form:radiobutton path="ciudadEstudios" value="Bilbao"/>
	
	<br/><br/>
	
	Inglés <form:checkbox path="idiomas" value="Ingles"/>
	Francés <form:checkbox path="idiomas" value="Frances"/>
	Portugués <form:checkbox path="idiomas" value="Portugues"/>
	Japonés <form:checkbox path="idiomas" value="Japones"/>
	
	<br/><br/><br/><br/><br/>
	
	<input type="submit" value="Enviar">
	
	</form:form>

</body>
</html>