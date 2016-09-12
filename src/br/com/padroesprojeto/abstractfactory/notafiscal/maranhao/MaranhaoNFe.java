package br.com.padroesprojeto.abstractfactory.notafiscal.maranhao;

import br.com.padroesprojeto.abstractfactory.notafiscal.NFe;

public class MaranhaoNFe implements NFe{

	@Override
	public void gerar() {
		System.out.println("NOTA FISCAL MARANHÃO GERAL");
		
	}

}
