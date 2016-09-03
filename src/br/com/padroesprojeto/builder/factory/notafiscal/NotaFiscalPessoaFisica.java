package br.com.padroesprojeto.builder.factory.notafiscal;

import java.util.ArrayList;

import br.com.padroesprojeto.builder.IProduto;
import br.com.padroesprojeto.builder.Imposto;
import br.com.padroesprojeto.builder.NotaFiscal;
import br.com.padroesprojeto.builder.factory.imposto.ImpostoPessoaFisica;

public class NotaFiscalPessoaFisica extends NotaFiscal{
	
	public NotaFiscalPessoaFisica(){
		this.listaProdutos = new ArrayList<IProduto>();
	}
	
	@Override
	public Imposto criarImposto() {
		// TODO Auto-generated method stub
		return new ImpostoPessoaFisica();
	}

}
