package br.com.padroesprojeto.builder.factory.imposto;

import java.math.BigDecimal;

import br.com.padroesprojeto.builder.Imposto;

public class ImpostoPessoaJuridica implements Imposto{

	@Override
	public BigDecimal calcularImposto(BigDecimal valor) {
		// TODO Auto-generated method stub
		return valor.multiply(new BigDecimal(0.07)) ;
	}
	
}
