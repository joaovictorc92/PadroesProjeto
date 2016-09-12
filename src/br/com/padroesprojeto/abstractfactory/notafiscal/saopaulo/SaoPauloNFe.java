package br.com.padroesprojeto.abstractfactory.notafiscal.saopaulo;

import br.com.padroesprojeto.abstractfactory.notafiscal.NFe;

public class SaoPauloNFe implements NFe{

	@Override
	public void gerar() {
		System.out.println("NOTA FISCAL SAO PAULO GERADA");
		
	}
	
}
