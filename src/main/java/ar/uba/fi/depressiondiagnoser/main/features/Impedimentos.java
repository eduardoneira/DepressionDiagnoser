package ar.uba.fi.depressiondiagnoser.main.features;

public class Impedimentos {
	
	private Integer vidaCotidiana;
	private Integer sociales;
	private Integer laborales;
	
	public Impedimentos(Integer vidaCotidiana, Integer sociales, Integer laborales) {
		super();
		this.vidaCotidiana = vidaCotidiana;
		this.sociales = sociales;
		this.laborales = laborales;
	}

	public Integer getVidaCotidiana() {
		return vidaCotidiana;
	}
	
	public void setVidaCotidiana(Integer vidaCotidiana) {
		this.vidaCotidiana = vidaCotidiana;
	}
	
	public Integer getSociales() {
		return sociales;
	}
	
	public void setSociales(Integer sociales) {
		this.sociales = sociales;
	}
	
	public Integer getLaborales() {
		return laborales;
	}
	
	public void setLaborales(Integer laborales) {
		this.laborales = laborales;
	}
	
}
