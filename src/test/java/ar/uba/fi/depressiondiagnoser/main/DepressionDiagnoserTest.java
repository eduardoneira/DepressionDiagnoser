package ar.uba.fi.depressiondiagnoser.main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.builder.KnowledgeBuilderResult;
import org.kie.internal.builder.ResultSeverity;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

import ar.uba.fi.depressiondiagnoser.main.helpers.Parser;

@SuppressWarnings("deprecation")
public class DepressionDiagnoserTest {

	private KnowledgeBuilder kbuilder;
	private KnowledgeBase kbase;
	private StatefulKnowledgeSession ksession;

	@Before
	public void setUp() {
		kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("rules.drl"), ResourceType.DRL);
		if (kbuilder.hasResults(ResultSeverity.ERROR)) {
			for (KnowledgeBuilderResult result: kbuilder.getResults(ResultSeverity.ERROR)) {
				System.out.println(result.getMessage());
			}
			System.exit(1);
		}
		kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		ksession = kbase.newStatefulKnowledgeSession();
	}

	@Test
	public void testPsicologo() {
		Paciente paciente1 = getPaciente("psicologo1.json");
		Paciente paciente2 = getPaciente("psicologo2.json");
		
		this.ksession.insert(paciente1);
		this.ksession.insert(paciente2);
		
		this.ksession.fireAllRules();
		
		assertEquals(Diagnosticos.PSICOLOGO, paciente1.getDiagnostico());
		assertEquals(Diagnosticos.PSICOLOGO, paciente2.getDiagnostico());
	}
	
	@Test
	public void testPsiquiatra() {
		Paciente paciente1 = getPaciente("psiquiatra1.json");
		Paciente paciente2 = getPaciente("psiquiatra2.json");
		Paciente paciente3 = getPaciente("psiquiatra3.json");
		
		this.ksession.insert(paciente1);
		this.ksession.insert(paciente2);
		this.ksession.insert(paciente3);
		
		this.ksession.fireAllRules();
		
		assertEquals(Diagnosticos.PSIQUIATRA, paciente1.getDiagnostico());
		assertEquals(Diagnosticos.PSIQUIATRA, paciente2.getDiagnostico());
		assertEquals(Diagnosticos.PSIQUIATRA, paciente3.getDiagnostico());
	}
	
	@Test
	public void testPsicologoYPsiquiatra() {
		Paciente paciente1 = getPaciente("psicologoypsiquiatra1.json");
		Paciente paciente2 = getPaciente("psicologoypsiquiatra2.json");
		Paciente paciente3 = getPaciente("psicologoypsiquiatra3.json");
		Paciente paciente4 = getPaciente("psicologoypsiquiatra4.json");
		
		this.ksession.insert(paciente1);
		this.ksession.insert(paciente2);
		this.ksession.insert(paciente3);
		this.ksession.insert(paciente4);
		
		this.ksession.fireAllRules();
		
		assertEquals(Diagnosticos.PSICOLOGOYPSIQUIATRA, paciente1.getDiagnostico());
		assertEquals(Diagnosticos.PSICOLOGOYPSIQUIATRA, paciente2.getDiagnostico());
		assertEquals(Diagnosticos.PSICOLOGOYPSIQUIATRA, paciente3.getDiagnostico());
		assertEquals(Diagnosticos.PSICOLOGOYPSIQUIATRA, paciente4.getDiagnostico());
	}
	
	@Test
	public void testGuardiaDeSaludMental() {
		Paciente paciente1 = getPaciente("guardiadesaludmental1.json");
		Paciente paciente2 = getPaciente("guardiadesaludmental2.json");
		Paciente paciente3 = getPaciente("guardiadesaludmental3.json");

		this.ksession.insert(paciente1);
		this.ksession.insert(paciente2);
		this.ksession.insert(paciente3);
		
		this.ksession.fireAllRules();
		
		assertEquals(Diagnosticos.GUARDIADESALUDMENTAL, paciente1.getDiagnostico());
		assertEquals(Diagnosticos.GUARDIADESALUDMENTAL, paciente2.getDiagnostico());
		assertEquals(Diagnosticos.GUARDIADESALUDMENTAL, paciente3.getDiagnostico());
	}
	
	@Test
	public void testInternacion() {
		Paciente paciente1 = getPaciente("internacion1.json");
		Paciente paciente2 = getPaciente("internacion2.json");
		Paciente paciente3 = getPaciente("internacion3.json");

		this.ksession.insert(paciente1);
		this.ksession.insert(paciente2);
		this.ksession.insert(paciente3);
		
		this.ksession.fireAllRules();
		
		assertEquals(Diagnosticos.INTERNACION, paciente1.getDiagnostico());
		assertEquals(Diagnosticos.INTERNACION, paciente2.getDiagnostico());
		assertEquals(Diagnosticos.INTERNACION, paciente3.getDiagnostico());
	}

	private Paciente getPaciente(String filename) {
		return Parser.parse("src/test/resources/"+filename);
	}

}