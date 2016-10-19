package br.com.padroesprojeto.strategy.form;

import br.com.padroesprojeto.strategy.seguro.service.CalculadoraPremioSeguro;
import br.com.padroesprojeto.strategy.seguro.service.CalculadoraPremioSeguroParaCarro;
import br.com.padroesprojeto.strategy.seguro.service.CalculadoraPremioSeguroParaMoto;

public enum TipoVeiculo {
	CARRO{

		@Override
		public CalculadoraPremioSeguro obterSeguro() {
			// TODO Auto-generated method stub
			return new CalculadoraPremioSeguroParaCarro();
		}
		
	},
	MOTO{

		@Override
		public CalculadoraPremioSeguro obterSeguro() {
			// TODO Auto-generated method stub
			return new CalculadoraPremioSeguroParaMoto();
		}
		
	};
	
	
	public abstract CalculadoraPremioSeguro obterSeguro();
}
