package br.com.padroesprojeto.observer.listener;

import br.com.padroesprojeto.observer.notificador.Notificador;

public class EntregaListener implements Listener{
	private Notificador notificador; 
	
	public EntregaListener(Notificador notificador){
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}
	
	@Override
	public void atualizar() {
		System.out.println("RESERVANDO CAMINHAO");	
	}

}
