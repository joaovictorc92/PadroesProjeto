package br.com.padroesprojeto.abstractfactory.venda;

import br.com.padroesprojeto.abstractfactory.boleto.Boleto;
import br.com.padroesprojeto.abstractfactory.notafiscal.NFe;

public interface ModuloVendaFactory {
	public abstract NFe criarNFe();
	public abstract Boleto criarBoleto();
}
