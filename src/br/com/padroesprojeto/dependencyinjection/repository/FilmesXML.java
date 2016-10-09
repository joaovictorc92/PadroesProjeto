package br.com.padroesprojeto.dependencyinjection.repository;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import br.com.padroesprojeto.dependencyinjection.form.Filme;

public class FilmesXML implements Filmes {
	
	@Override
	public void salvar(Filme filme){
		JAXBContext context = null;
		FileOutputStream out = null;
		try{
		context = JAXBContext.newInstance(Filme.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
		out = new FileOutputStream("resources/"+filme.getNome() + ".xml");
		marshaller.marshal(filme,out);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
