package ar.uba.fi.depressiondiagnoser.main;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

import ar.uba.fi.depressiondiagnoser.main.features.Desesperanza;
import ar.uba.fi.depressiondiagnoser.main.features.Duelo;

public class DepressionDiagnoserTest {

	private KieServices kServices;
	private KieContainer kContainer;
	private KieSession ksession;

	@Before
	public void setUp() {
        this.kServices = KieServices.Factory.get();
        this.kContainer = this.kServices.getKieClasspathContainer();
        this.ksession = this.kContainer.newKieSession("rules");
	}
//	public void setUp() {
//		kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
//		kbuilder.add(ResourceFactory.newClassPathResource("rules.drl"), ResourceType.DRL);
//		kbase = KnowledgeBaseFactory.newKnowledgeBase();
//		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
//		ksession = kbase.newStatefulKnowledgeSession();
//	}

	@Test
	public void testPsicologo() {

	}

}
