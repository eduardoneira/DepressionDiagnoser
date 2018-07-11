package ar.uba.fi.depressiondiagnoser.main;

import java.util.HashMap;
import java.util.Map;

public class Diagnosticos {
	
	public static final String SINDEPRESION	= "Sin depresion";
	public static final String PSICOLOGO = "Psicologo";
	public static final String PSIQUIATRA = "Psiquiatra";
	public static final String PSICOLOGOYPSIQUIATRA ="Psicologo y Psiquiatra";
	public static final String GUARDIADESALUDMENTAL = "Guardia de Salud Mental";
	public static final String INTERNACION = "Internacion";
	
	private static final Map<String,Integer> diagnosticosPriorizados = new HashMap<String,Integer>(){{
		put(SINDEPRESION,0);
		put(PSICOLOGO,1);
		put(PSIQUIATRA,2);
		put(PSICOLOGOYPSIQUIATRA,3);
		put(GUARDIADESALUDMENTAL,4);
		put(INTERNACION,5);
	}};
	
	public static String greaterPriority(String a, String b) {
		if (diagnosticosPriorizados.get(a) > diagnosticosPriorizados.get(b)) {
			return a;
		} else {
			return b;
		}
	}
}
