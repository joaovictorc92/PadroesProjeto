package br.com.padroesprojeto.abstractfactory.venda;

import br.com.padroesprojeto.abstractfactory.boleto.Boleto;
import br.com.padroesprojeto.abstractfactory.notafiscal.NFe;

public class Venda {
	NFe notaFiscal;
	Boleto boleto;
	public Venda(ModuloVendaFactory moduloVendaFactory){
		notaFiscal = moduloVendaFactory.criarNFe();
		boleto = moduloVendaFactory.criarBoleto();
	}
	public boolean realizar(){
		notaFiscal.gerar();
		boleto.emitir();
		return true;
	}
}
