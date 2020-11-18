package webApps;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/principal")
public class NuevoControlador { 
	
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() { // Proporciona el Formulario (pag)
		return "formularioDato"; // * Nombre de la pag. (Formulario)
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() { // Muestra la respuesta (pag)
		return "formularioRespuesta"; // * Nombre de la pag. (Respuesta)
	}
	
	@RequestMapping("/procesarFormularioMejorado")// Se conecta al action en FormularioBas para ejecutar la peticion
//	public String procesarFormularioActualizado(HttpServletRequest request, Model modelo) { // Petición-obj y modelo
	public String procesarFormularioActualizado(@RequestParam("nombreAlumno") String nombre, Model modelo) { // Petición-obj y modelo
		
//		String nombre = request.getParameter("nombreAlumno"); // Almacenamos el valor
		
		nombre += " es el mejor estudiante."; // altera el valor de nombre 
		
		String mensajeFinal = "¿Quién es el mejor alumno? " + nombre; 

		// Agregando info al modelo
		
		modelo.addAttribute("Msj", mensajeFinal); // Add..
		
		return "formularioRespuesta";
	}
}



/*
@RequestParam("nombreAlumno") String nombre
Binding Request 

Estamos almacenando desde los parámetros del método lo que obtenemos con @RequestParam, todo funciona igual.
*/

/*
@RequestMapping("/procesarFormularioMejorado")
Está conectada al action en FormularioBas para ejecutar la peticion, mediante el método procesarFormularioActualizado.

public String procesarFormularioActualizado(HttpServletRequest request, Model modelo) { }
Este método tiene como parámetros la petición que recibe y otro de tipo Model para añadir esa información al modelo
Tras lo cual para almacenar el valor dentro del objeto request es necesario crear una variable.

*/

/*

	{pageContext.request.contextPath}
	JSP Tag: Para enlazar los recursos
 */


