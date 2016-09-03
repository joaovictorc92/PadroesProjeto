package br.com.padroesprojeto.builder;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.padroesprojeto.builder.factory.notafiscal.NotaFiscalPessoaFisica;
import br.com.padroesprojeto.builder.factory.notafiscal.NotaFiscalPessoaJuridica;
import br.com.padroesprojeto.builder.form.Produto;

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
	
	public NotaFiscalBuilder definirProdutos(String nome,int quantidade,String valor){
		instancia.getListaProdutos().add(new Produto(nome,quantidade,new BigDecimal(valor)));
		return this;
	}
	
	public NotaFiscalBuilder definirNumero(int numero){
		instancia.setNumero(numero);
		return this;
	}
	
	public NotaFiscalBuilder definirDataEmissao(String dataEmissao){
		DateFormat format =  new SimpleDateFormat("dd/MM/yyyy");
		Date date = new  Date();
		try {			
			date.setTime(format.parse(dataEmissao).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		instancia.setDataEmissao(date);
		return this;
	}
	
	public NotaFiscal getNota(){
		return instancia;
	}
}
