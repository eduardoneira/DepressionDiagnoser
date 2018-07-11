package ar.uba.fi.depressiondiagnoser.main.features;

public class Desesperanza {

	private Integer ideacionSuicida;
	private Integer visionDelFuturo;
	
	public Desesperanza(Integer ideacionSuicida, Integer visionDelFuturo) throws Exception {
		super();
		
		if (ideacionSuicida > 3 || ideacionSuicida < 1) {
			throw new Exception("La ideacion suicida debe pertenecer al rango entre 1 a 3");
		}
		
		if (visionDelFuturo > 3 || visionDelFuturo < 1) {
			throw new Exception("La vision del futuro debe pertenecer al rango entre 1 a 3");
		}
		
		this.ideacionSuicida = ideacionSuicida;
		this.visionDelFuturo = visionDelFuturo;
	}
	
	public Integer getIdeacionSuicida() {
		return ideacionSuicida;
	}
	public void setIdeacionSuicida(Integer ideacionSuicida) {
		this.ideacionSuicida = ideacionSuicida;
	}
	public Integer getVisionDelFuturo() {
		return visionDelFuturo;
	}
	public void setVisionDelFuturo(Integer visionDelFuturo) {
		this.visionDelFuturo = visionDelFuturo;
	}
	
	
}
