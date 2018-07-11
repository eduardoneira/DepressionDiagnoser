package ar.uba.fi.depressiondiagnoser.main;

import ar.uba.fi.depressiondiagnoser.main.features.*;

public class Paciente {
	
	private Desesperanza desesperanza;
	private Duelo duelo;
	private Medicacion medicacion;
	private Enfermedad enfermedad;
	private Adiccion adiccion;
	private EstadoDeAnimo estadoDeAnimo;
	private Impedimentos impedimentos;
	private String diagnostico;
		
	public Paciente(Desesperanza desesperanza, Duelo duelo, Medicacion medicacion, Enfermedad enfermedad,
			Adiccion adiccion, EstadoDeAnimo estadoDeAnimo, Impedimentos impedimentos) {
		super();
		this.desesperanza = desesperanza;
		this.duelo = duelo;
		this.medicacion = medicacion;
		this.enfermedad = enfermedad;
		this.adiccion = adiccion;
		this.estadoDeAnimo = estadoDeAnimo;
		this.impedimentos = impedimentos;
		this.diagnostico = Diagnosticos.PSICOLOGO;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnosticoPriorizado(String diagnostico) {
		this.diagnostico = Diagnosticos.greaterPriority(this.diagnostico, diagnostico);
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Desesperanza getDesesperanza() {
		return desesperanza;
	}
	
	public Duelo getDuelo() {
		return duelo;
	}
	
	public Medicacion getMedicacion() {
		return medicacion;
	}
	
	public Enfermedad getEnfermedad() {
		return enfermedad;
	}
	
	public Adiccion getAdiccion() {
		return adiccion;
	}
	
	public EstadoDeAnimo getEstadoDeAnimo() {
		return estadoDeAnimo;
	}
	
	public Impedimentos getImpedimentos() {
		return impedimentos;
	}
	
}
