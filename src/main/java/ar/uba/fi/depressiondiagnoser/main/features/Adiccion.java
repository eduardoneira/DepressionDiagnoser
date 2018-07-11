package ar.uba.fi.depressiondiagnoser.main.features;

public class Adiccion {

	private Integer grado;
	private Boolean rehabilitacion;
	
	public Adiccion(Integer grado, Boolean rehabilitacion) throws Exception {
		super();
		
		if (grado > 4 || grado < 1) {
			throw new Exception("La opción grado debe pertenecer al rango entre 1 a 4");
		}
		
		this.grado = grado;
		this.rehabilitacion = rehabilitacion;
	}

	public Integer getGrado() {
		return grado;
	}
	
	public void setGrado(Integer grado) {
		this.grado = grado;
	}
	
	public Boolean getRehabilitacion() {
		return rehabilitacion;
	}
	
	public void setRehabilitacion(Boolean rehabilitacion) {
		this.rehabilitacion = rehabilitacion;
	}
	
}
