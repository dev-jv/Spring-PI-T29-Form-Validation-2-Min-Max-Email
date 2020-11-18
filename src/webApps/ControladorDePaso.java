package webApps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secundaria")
public class ControladorDePaso {
	
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() { // Proporciona el Formulario (pag)
		return "formularioDato"; // * Nombre de la pag. (Formulario)
	}

	@RequestMapping("/procesarFormularioMejorado")
	public String procesarFormularioActualizado(@RequestParam("nombreAlumno") String nombre, Model modelo) { 
		
		nombre += " es el peor estudiante.";
		
		String mensajeFinal = "¿Quién es el peor alumno? " + nombre; 
		
		// Agregando info al modelo
		
		modelo.addAttribute("Msj", mensajeFinal);
		
		return "formularioRespuesta";
	}
}

/*

@RequestMapping("/secundaria")
Es necesaria su implementación para solucionar el problema de los @RequestMapping con rutas iguales.
Los JSP deben actualizar las rutas de enlace para los @RequestMapping.

*/


