package ar.uba.fi.depressiondiagnoser.main;

import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

import ar.uba.fi.depressiondiagnoser.main.helpers.Parser;

@SuppressWarnings("deprecation")
public class Main {
	
	public static void main(String[] args) {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("rules.drl"), ResourceType.DRL);
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		Paciente paciente = Parser.parse("src/main/resources/paciente.json");
		ksession.insert(paciente);
		ksession.fireAllRules();
		System.out.println("Diagnostico del Paciente: "+paciente.getDiagnostico());
	}

}
