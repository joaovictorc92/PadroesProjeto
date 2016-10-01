package br.com.padroesprojeto.observer.listener;

import br.com.padroesprojeto.observer.form.Pedido;
import br.com.padroesprojeto.observer.notificador.Notificador;

public class FaturamentoListener implements Listener{
	private Notificador notificador; 
	
	public FaturamentoListener(Notificador notificador){
		this.notificador = notificador;
		notificador.registrarListener(this);
	}
	
	@Override
	public void atualizar() {
		float valorTotal = 0;
		for(Pedido pedido : notificador.getListaPedidos()){
			valorTotal += pedido.getValor();
		}
		System.out.println("VALOR TOTAL DO FATURAMENTO "+valorTotal);
	}

}
