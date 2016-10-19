package br.com.padroesprojeto.strategy.service;

import br.com.padroesprojeto.strategy.form.Cliente;
import br.com.padroesprojeto.strategy.seguro.service.CalculadoraPremioSeguro;

public class PropostaSeguro {
	private CalculadoraPremioSeguro calculadoraPremioSeguro;
	private Cliente cliente;
	private double valorVeiculo;
	
	public PropostaSeguro(Cliente cliente,double valorVeiculo){
		this.cliente = cliente;
		this.valorVeiculo = valorVeiculo;
	}
	
	public void gerar(){
		calculadoraPremioSeguro.calcular(this.cliente, this.valorVeiculo);
	}
	
	public void setCalculadora(CalculadoraPremioSeguro calculadoraPremioSeguro){
		this.calculadoraPremioSeguro = calculadoraPremioSeguro;
	}
}
