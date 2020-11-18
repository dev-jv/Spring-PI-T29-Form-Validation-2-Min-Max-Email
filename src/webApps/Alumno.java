package webApps;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

import javax.validation.constraints.*;

public class Alumno {
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getOptativa() {
		return optativa;
	}

	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}

	public String getCiudadEstudios() {
		return ciudadEstudios;
	}

	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@NotNull
	@Size(min=2, message="Campo requerido!")
	private String nombre;
	
	private String apellidos;
	
	@Min(value=10, message="No se permiten edades menores a 10")
	@Max(value=25, message="No se permiten edades mayores a 25")
	private int edad;
	
	@Email
	private String email;
	
	private String optativa;
	
	private String ciudadEstudios;
	
	private String idiomas;

}


