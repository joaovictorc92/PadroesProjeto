package br.com.padroesprojeto.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.padroesprojeto.observer.form.Pedidos;
import br.com.padroesprojeto.observer.form.PedidosXML;

public class ObserverTest {

	@Test
	public void pedidosTest() {
		Pedidos pedidos =  new PedidosXML();
		assertNotNull(pedidos.getPedidos());
	}

}
