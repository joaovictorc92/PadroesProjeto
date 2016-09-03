package br.com.padroesprojeto.builder.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.padroesprojeto.builder.NotaFiscal;
import br.com.padroesprojeto.builder.NotaFiscalBuilder;

public class BuilderTest {

	@Test
	public void testBuilderPessoaFisica() {
		NotaFiscal nota = new NotaFiscalBuilder().
			notaFiscalPessoaFisica().
				definirNumero(1).
				 definirProdutos("Biscoito", 2, "2.00").
				 definirProdutos("Lata de refrigerante", 2, "3.00").
					definirDataEmissao("03/09/2016").
						getNota();
		assertEquals(new BigDecimal("0.7").doubleValue(), nota.calcularImposto().doubleValue(),0.0001);
	}
	
	@Test
	public void testBuilderPessoaJuridica() {
		NotaFiscal nota = new NotaFiscalBuilder().
			notaFiscalPessoaJuridica().
				definirNumero(2).
				 definirProdutos("Biscoito", 2, "2.00").
				 definirProdutos("Lata de refrigerante", 2, "3.00").
				 definirProdutos("Pacote de Arroz", 1, "10.00").
					definirDataEmissao("03/09/2016").
						getNota();
		assertEquals(new BigDecimal("0.8").doubleValue(), nota.calcularImposto().doubleValue(),0.0001);
	}

}
