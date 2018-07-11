package ar.uba.fi.depressiondiagnoser.main.features;

public class EstadoDeAnimo {

	private Integer tristeza;
	private Integer ansiedad;
	private Integer hiperactividad;
	private Integer irritabilidad;
	private Integer variacion;
	
	public EstadoDeAnimo(Integer tristeza, Integer ansiedad, Integer hiperactividad, Integer irritabilidad,
			Integer variacion) throws Exception {
		super();
		
		this.tristeza = tristeza;
		this.ansiedad = ansiedad;
		this.hiperactividad = hiperactividad;
		this.irritabilidad = irritabilidad;
		this.variacion = variacion;
	}
	
	public Integer getTristeza() {
		return tristeza;
	}
	
	public void setTristeza(Integer tristeza) {
		this.tristeza = tristeza;
	}
	
	public Integer getAnsiedad() {
		return ansiedad;
	}
	
	public void setAnsiedad(Integer ansiedad) {
		this.ansiedad = ansiedad;
	}
	
	public Integer getHiperactividad() {
		return hiperactividad;
	}
	
	public void setHiperactividad(Integer hiperactividad) {
		this.hiperactividad = hiperactividad;
	}
	
	public Integer getIrritabilidad() {
		return irritabilidad;
	}
	
	public void setIrritabilidad(Integer irritabilidad) {
		this.irritabilidad = irritabilidad;
	}
	
	public Integer getVariacion() {
		return variacion;
	}
	
	public void setVariacion(Integer variacion) {
		this.variacion = variacion;
	}
		
}
