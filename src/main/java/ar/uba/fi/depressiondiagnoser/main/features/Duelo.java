package ar.uba.fi.depressiondiagnoser.main.features;

public class Duelo {

	private Integer duracion;
	private Boolean relevancia;
	
	public Duelo(Integer duracion, Boolean relevancia) throws Exception {
		super();
		
		if ( duracion > 4 || duracion < 1 ) {
			throw new Exception("La duración debe pertenecer al rango entre 1 a 4");
		}
		
		this.duracion = duracion;
		this.relevancia = relevancia;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public Boolean getRelevancia() {
		return relevancia;
	}
	public void setRelevancia(Boolean relevancia) {
		this.relevancia = relevancia;
	}
	
	
}
