package ar.uba.fi.depressiondiagnoser.main.features;

public class Enfermedad {
	
	private Boolean influencia;
	private Integer diagnosticacion;
	
	public Enfermedad(Boolean influencia, Integer diagnosticacion) throws Exception {
		super();
		
		if (diagnosticacion > 4 || diagnosticacion < 1) {
			throw new Exception("La opción diagnosticacion por debe pertenecer al rango entre 1 a 4");
		}
		
		this.influencia = influencia;
		this.diagnosticacion = diagnosticacion;
	}
	
	public Boolean getInfluencia() {
		return influencia;
	}
	
	public void setInfluencia(Boolean influencia) {
		this.influencia = influencia;
	}
	
	public Integer getDiagnosticacion() {
		return diagnosticacion;
	}
	
	public void setDiagnosticacion(Integer diagnosticacion) {
		this.diagnosticacion = diagnosticacion;
	}
	
}
