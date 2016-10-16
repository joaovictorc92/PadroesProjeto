package br.com.padroesprojeto.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.padroesprojeto.decorator.dao.AgendaDAO;
import br.com.padroesprojeto.decorator.dao.AgendaDaoImpl;
import br.com.padroesprojeto.decorator.dao.CacheAgendaDao;
import br.com.padroesprojeto.decorator.form.Contato;

public class DecoratorTest {

	@Test
	public void test() {
		AgendaDaoImpl agendaDao = new AgendaDaoImpl();
		assertNotNull(agendaDao.carregarContatos());
	}
	
	@Test
	public void testAdicionarContato(){
		AgendaDaoImpl agendaDao = new AgendaDaoImpl();
		Contato contato = new Contato();
		contato.setCodigo(4);
		contato.setNome("Pedro Paulo");
		contato.setTelefone("21 9999 9999");
		agendaDao.inserirContato(contato);
	}
	
	@Test
	public void testDecoratorAdicionarCadastro(){
		AgendaDAO agendaDao = new CacheAgendaDao(new AgendaDaoImpl());
		Contato contato = new Contato();
		contato.setCodigo(5);
		contato.setNome("Paulo Sergio");
		contato.setTelefone("21 9999 9999");
		agendaDao.inserirContato(contato);
		Contato c = agendaDao.buscar(5);
		assertEquals(c.getCodigo(), contato.getCodigo());
	}

}
