package br.com.padroesprojeto.observer.notificador;

import java.util.Collection;

import br.com.padroesprojeto.observer.form.Pedido;
import br.com.padroesprojeto.observer.listener.Listener;

public interface Notificador {
	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	
	public void enviarPedidos(Collection<Pedido> listaPedidos);
	public Collection<Pedido> getListaPedidos();
}
