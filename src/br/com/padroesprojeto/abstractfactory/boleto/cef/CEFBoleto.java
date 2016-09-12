package br.com.padroesprojeto.abstractfactory.boleto.cef;

import br.com.padroesprojeto.abstractfactory.boleto.Boleto;

public class CEFBoleto implements Boleto{

	@Override
	public void emitir() {
		System.out.println("BOLETO CAIXA EMITIDO");
		
	}
 
}
