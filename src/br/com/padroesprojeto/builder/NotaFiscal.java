package br.com.padroesprojeto.builder;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

public abstract class NotaFiscal {
	private int numero;
	private Date dataEmissao;
	protected Collection<IProduto> listaProdutos;
	
	public abstract Imposto criarImposto();
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Collection<IProduto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(Collection<IProduto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public BigDecimal calcularImposto(){
		return criarImposto().calcularImposto(getValorTotal());
	}
	
	public BigDecimal getValorTotal(){
		BigDecimal valor =  new BigDecimal(0);
		for(IProduto produto: listaProdutos ){
			valor = valor.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
		}
		return valor;
	}
	
}
