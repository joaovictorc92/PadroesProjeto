package br.com.padroesprojeto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.padroesprojeto.abstractfactory.venda.LojaFactory;
import br.com.padroesprojeto.abstractfactory.venda.Venda;

public class VendaAbstractFactoryTest {
	Venda venda;

	@Test
	public void test() {
		venda = new Venda(new LojaFactory());
		assertTrue(venda.realizar());
	}

}
