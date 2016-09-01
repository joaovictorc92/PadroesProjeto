package br.com.padroesprojeto.builder;

import java.math.BigDecimal;

public interface Imposto {
	public abstract BigDecimal calcularImposto(BigDecimal valor);
}
