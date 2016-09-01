package br.com.padroesprojeto.builder;

import java.math.BigDecimal;

public interface IProduto {

	void setValor(BigDecimal valor);

	BigDecimal getValor();

	void setQuantidade(int quantidade);

	int getQuantidade();

	void setNome(String nome);

	String getNome();

}
