package br.com.padroesprojeto.builder;

import br.com.padroesprojeto.builder.factory.notafiscal.NotaFiscalPessoaFisica;
import br.com.padroesprojeto.builder.factory.notafiscal.NotaFiscalPessoaJuridica;

public class NotaFiscalBuilder {
	private NotaFiscal instancia;
	
	public NotaFiscalBuilder notaFiscalPessoaFisica(){
		instancia = new NotaFiscalPessoaFisica();
		return this;
	}
	
	public NotaFiscalBuilder notaFiscalPessoaJuridica(){
		instancia = new NotaFiscalPessoaJuridica();
		return this;
	}
	
	public NotaFiscalBuilder definirProduto(){
		return this;
	}
	
	public NotaFiscalBuilder definirNumero(int numero){
		instancia.setNumero(numero);
		return this;
	}
	
	public NotaFiscalBuilder definirDataEmissao(String dataEmissao){
		return this;
	}
}
