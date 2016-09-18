package br.com.padroesprojeto.test;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import br.com.padroesprojeto.proxy.EnviadorEmail;
import br.com.padroesprojeto.proxy.EnviadorEmailProxy;
import br.com.padroesprojeto.proxy.EnviadorEmailServico;

public class ProxyTest {

	@Test
	public void test() {
		Collection<String> lista =  new ArrayList();
		lista.add("joao_victor_costa@hotmail.com");
		lista.add("joaovictorc92@gmail.com");
		lista.add("joao_gabriel_costa99@hotmail.com");
		EnviadorEmail enviadorEmailServico = new EnviadorEmailServico(lista);
		enviadorEmailServico.enviar("mensagem");
	}
	
	@Test
	public void testProxy(){
		Collection<String> lista =  new ArrayList();
		lista.add("joao_victor_costa@hotmail.com");
		lista.add("joaovictorc92@gmail.com");
		lista.add("joao_gabriel_costa99@hotmail.com");
		EnviadorEmail enviadorEmailServico = new EnviadorEmailProxy(lista);
		enviadorEmailServico.enviar("mensagem");
	}

}
