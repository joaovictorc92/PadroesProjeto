package br.com.padroesprojeto.proxy;

import java.util.Collection;

public class EnviadorEmailServico implements EnviadorEmail{
	
	private Collection<String> listaEmails;
	
	public EnviadorEmailServico(Collection<String> lista){
		listaEmails = lista;
	}
	
	@Override
	public void enviar(String mensagem) {
		for(String email : listaEmails){
			System.out.println("Enviado email para "+ email);
		}
	}
}
