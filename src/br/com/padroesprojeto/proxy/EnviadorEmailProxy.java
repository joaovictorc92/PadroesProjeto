package br.com.padroesprojeto.proxy;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class EnviadorEmailProxy implements EnviadorEmail {
	private EnviadorEmail enviadorEmailServico;
	private Collection<String> listaEmails;
	private Collection<String> listanegra;

	public EnviadorEmailProxy(Collection<String> lista) {
		listaEmails = lista;
		listanegra = new ArrayList<String>();
	}

	@Override
	public void enviar(String mensagem) {
		listaEmails.removeAll(getEmailsXML("resources/contatos.xml"));
		this.enviadorEmailServico = new EnviadorEmailServico(listaEmails);
		enviadorEmailServico.enviar("mensagem");
	}

	@SuppressWarnings("unchecked")
	public Collection<String> getEmailsXML(String... nomeArquivos) {

		try {
			for (String arquivo : nomeArquivos) {
				JAXBContext jaxbContext = JAXBContext.newInstance(Emails.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Emails emails = (Emails) jaxbUnmarshaller.unmarshal(this.getClass().getResource(arquivo));
				for(String email: emails.getEmail()){
					listanegra.add(email);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listanegra;
	}

}
