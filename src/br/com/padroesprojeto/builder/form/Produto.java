package br.com.padroesprojeto.builder.form;

import java.math.BigDecimal;

import br.com.padroesprojeto.builder.IProduto;

public class Produto implements IProduto{

	private String nome;
	private int quantidade;
	private BigDecimal valor;
	
	public Produto(String nome,int quantidade,BigDecimal valor){
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public int getQuantidade() {
		return quantidade;
	}
	@Override
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public BigDecimal getValor() {
		return valor;
	}
	@Override
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
