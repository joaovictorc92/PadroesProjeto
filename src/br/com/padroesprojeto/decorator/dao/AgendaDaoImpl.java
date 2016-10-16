package br.com.padroesprojeto.decorator.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.padroesprojeto.decorator.form.Contato;
import br.com.padroesprojeto.decorator.form.Contatos;

public class AgendaDaoImpl implements AgendaDAO {
	Collection<Contato> listaContato;
	public AgendaDaoImpl(){
		listaContato = new ArrayList<Contato>();
	}
	@Override
	public void inserirContato(Contato contato) {
		JAXBContext jaxbContext;
		carregarContatos().add(contato);
		URL out;
		try{
			jaxbContext =  JAXBContext.newInstance(Contatos.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//out = new FileOutputStream("resources/contatos.xml");
			//out = this.getClass().getResource();
			FileOutputStream fileOutputStream = new FileOutputStream(new File("resources/contatos.xml"));
			marshaller.marshal(listaContato,fileOutputStream);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public Contato buscar(int codigo) {
		// TODO Auto-generated method stub
		for(Contato contato : carregarContatos()){
			if(contato.getCodigo() == codigo){
				return contato;
			}
		}
		return null;
	}
	
	public Collection<Contato> carregarContatos(){
		JAXBContext jaxbContext;
		try{
			jaxbContext =  JAXBContext.newInstance(Contatos.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			InputStream inputStream = new FileInputStream(new File("resources/contatos.xml"));
			listaContato = (Contatos) jaxbUnmarshaller.unmarshal(inputStream);
			//this.getClass().getResource("../resources/contatos.xml")
		}catch(Exception e){
			e.printStackTrace();
		}
		return listaContato;
	}

	

}
