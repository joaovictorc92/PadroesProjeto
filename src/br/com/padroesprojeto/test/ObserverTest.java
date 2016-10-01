package br.com.padroesprojeto.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.padroesprojeto.observer.form.Pedidos;
import br.com.padroesprojeto.observer.form.PedidosXML;
import br.com.padroesprojeto.observer.listener.EntregaListener;
import br.com.padroesprojeto.observer.listener.FaturamentoListener;
import br.com.padroesprojeto.observer.listener.Listener;
import br.com.padroesprojeto.observer.notificador.Notificador;
import br.com.padroesprojeto.observer.notificador.NotificadorPedidos;

public class ObserverTest {

	@Test
	public void pedidosTest() {
		Pedidos pedidos =  new PedidosXML();
		assertNotNull(pedidos.carregaPedidos());
	}
	
	@Test
	public void notificarPedidos(){
		Pedidos pedidos =  new PedidosXML();
		Notificador notificador = new NotificadorPedidos();
		Listener entregaListener = new EntregaListener(notificador);
		Listener faturamentoListener = new FaturamentoListener(notificador);
		notificador.enviarPedidos(pedidos.carregaPedidos());
	}
}
