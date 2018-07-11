package ar.uba.fi.depressiondiagnoser.main.helpers;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.uba.fi.depressiondiagnoser.main.Diagnosticos;
import ar.uba.fi.depressiondiagnoser.main.Paciente;

public class ParserTest {
	
	@Test
	public void testParse() {
		Paciente paciente = Parser.parse("src/test/resources/test.json");
		assertEquals(paciente.getDiagnostico(), Diagnosticos.PSICOLOGO);
	}
	
}
