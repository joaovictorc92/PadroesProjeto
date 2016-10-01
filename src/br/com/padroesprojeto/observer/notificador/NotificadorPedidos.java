package br.com.padroesprojeto.observer.notificador;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import br.com.padroesprojeto.observer.form.Pedido;
import br.com.padroesprojeto.observer.listener.Listener;

public class NotificadorPedidos implements Notificador{
	
	private Set<Listener> listeners;
	private Collection<Pedido> listaPedidos;
	
	public NotificadorPedidos() {
		this.listeners = new HashSet<>();
	}
	
	@Override
	public void registrarListener(Listener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void removerListener(Listener listener) {
		this.listeners.remove(listener);	
	}

	@Override
	public void notificarListeners() {
		for(Listener listener : listeners){
			listener.atualizar();
		}
		
	}

	@Override
	public void enviarPedidos(Collection<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
		notificarListeners();
	}

	@Override
	public Collection<Pedido> getListaPedidos() {
		return this.listaPedidos;
	}
	
}
