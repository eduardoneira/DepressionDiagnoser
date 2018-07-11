package ar.uba.fi.depressiondiagnoser.main.features;

public class Medicacion {

	private Integer influencia;
	private Integer recetadoPor;
	private Integer duracion;
	
	public Medicacion(Integer influencia, Integer recetadoPor, Integer duracion) throws Exception {
		super();
		
		if (influencia > 4 || influencia < 1) {
			throw new Exception("La opción influencia debe pertenecer al rango entre 1 a 4");
		}
		
		if (recetadoPor > 4 || recetadoPor < 1) {
			throw new Exception("La opción recetado por debe pertenecer al rango entre 1 a 4");
		}
		
		if (duracion > 4 || duracion < 1) {
			throw new Exception("La opción duracion debe pertenecer al rango entre 1 a 4");
		}
				
		this.influencia = influencia;
		this.recetadoPor = recetadoPor;
		this.duracion = duracion;
	}
	
	public Integer getInfluencia() {
		return influencia;
	}
	
	public void setInfluencia(Integer influencia) {
		this.influencia = influencia;
	}
	
	public Integer getRecetado() {
		return recetadoPor;
	}
	
	public void setRecetado(Integer recetado) {
		this.recetadoPor = recetado;
	}
	
	public Integer getDuracion() {
		return duracion;
	}
	
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	
}
