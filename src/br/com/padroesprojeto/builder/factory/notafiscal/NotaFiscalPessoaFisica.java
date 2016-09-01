package br.com.padroesprojeto.builder.factory.notafiscal;

import br.com.padroesprojeto.builder.Imposto;
import br.com.padroesprojeto.builder.NotaFiscal;
import br.com.padroesprojeto.builder.factory.imposto.ImpostoPessoaFisica;

public class NotaFiscalPessoaFisica extends NotaFiscal{

	@Override
	public Imposto criarImposto() {
		// TODO Auto-generated method stub
		return new ImpostoPessoaFisica();
	}

}
