package ar.uba.fi.depressiondiagnoser.main.helpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ar.uba.fi.depressiondiagnoser.main.Paciente;
import ar.uba.fi.depressiondiagnoser.main.features.Adiccion;
import ar.uba.fi.depressiondiagnoser.main.features.Desesperanza;
import ar.uba.fi.depressiondiagnoser.main.features.Duelo;
import ar.uba.fi.depressiondiagnoser.main.features.Enfermedad;
import ar.uba.fi.depressiondiagnoser.main.features.EstadoDeAnimo;
import ar.uba.fi.depressiondiagnoser.main.features.Impedimentos;
import ar.uba.fi.depressiondiagnoser.main.features.Medicacion;

public class Parser {
	
	public static Paciente parse(String filename) {
		Type type = new TypeToken<Map<String, Object>>(){}.getType();
		Gson gson = new Gson();
		
		String json = readFile(filename);
		Map<String, Map<String, String>> features = gson.fromJson(json, type);
		
		return buildPaciente(features);
	}
	
	private static String readFile(String filename) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
		   
			StringBuilder sb = new StringBuilder();
		    String line;
		    
		    while ((line = br.readLine()) != null) sb.append(line);
		    br.close();
		    
		    return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private static Paciente buildPaciente(Map<String, Map<String, String>> features) {
		try {
			Map<String, String> params = features.get("Desesperanza");
			Desesperanza desesperanza = new Desesperanza(Integer.parseInt(params.get("IdeacionSuicida")), 
														 Integer.parseInt(params.get("VisionDelFuturo")));
			
			params = features.get("Duelo");
			Duelo duelo = new Duelo(Integer.parseInt(params.get("Duracion")), 
									Boolean.parseBoolean(params.get("Relevancia")));
			
			params = features.get("Medicacion");
			Medicacion medicacion = new Medicacion(Integer.parseInt(params.get("Influencia")), 
												   Integer.parseInt(params.get("RecetadoPor")), 
												   Integer.parseInt(params.get("Duracion")));
			
			params = features.get("Enfermedad");
			Enfermedad enfermedad = new Enfermedad(Boolean.parseBoolean(params.get("Influencia")), 
												   Integer.parseInt(params.get("Diagnosticacion")));
			
			params = features.get("Adiccion");
			Adiccion adiccion = new Adiccion(Integer.parseInt(params.get("Grado")), 
											 Boolean.parseBoolean(params.get("Rehabilitacion")));
			
			params = features.get("EstadoDeAnimo");
			EstadoDeAnimo estadoDeAnimo = new EstadoDeAnimo(Integer.parseInt(params.get("Tristeza")), 
															Integer.parseInt(params.get("Ansiedad")), 
															Integer.parseInt(params.get("Hiperactividad")),
															Integer.parseInt(params.get("Irritabilidad")),
															Integer.parseInt(params.get("Variacion")));
			
			params = features.get("Impedimentos");
			Impedimentos impedimentos = new Impedimentos(Integer.parseInt(params.get("VidaCotidiana")), 
														 Integer.parseInt(params.get("Sociales")), 
														 Integer.parseInt(params.get("Laborales")));
			
			return new Paciente(desesperanza, duelo, medicacion, enfermedad, adiccion, estadoDeAnimo, impedimentos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
