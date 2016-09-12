package br.com.padroesprojeto.abstractfactory.boleto.bb;

import br.com.padroesprojeto.abstractfactory.boleto.Boleto;

public class BBBoleto implements Boleto{

	@Override
	public void emitir() {
		System.out.println("BOLETO BANCO DO BRASIL EMITIDO");
	}
	
}
