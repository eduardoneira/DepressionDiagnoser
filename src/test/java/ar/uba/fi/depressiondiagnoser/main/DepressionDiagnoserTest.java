package ar.uba.fi.depressiondiagnoser.main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

public class DepressionDiagnoserTest {

	private KnowledgeBuilder kbuilder;
	private KnowledgeBase kbase;
	private StatefulKnowledgeSession ksession;

	@Before
	public void setUp() {
		kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("rules.drl"), ResourceType.DRL);
		kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		ksession = kbase.newStatefulKnowledgeSession();
	}

	@Test
	public void testPsicologo() {
	}

}
