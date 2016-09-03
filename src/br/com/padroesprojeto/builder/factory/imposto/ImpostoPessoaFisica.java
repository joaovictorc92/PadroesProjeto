package br.com.padroesprojeto.builder.factory.imposto;

import java.math.BigDecimal;

import br.com.padroesprojeto.builder.Imposto;

public class ImpostoPessoaFisica implements Imposto {
	
	@Override
	public BigDecimal calcularImposto(BigDecimal valor) {
		
		return valor.multiply(new BigDecimal(0.07)) ;
	}
	
}
