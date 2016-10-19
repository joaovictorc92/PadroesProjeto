package br.com.padroesprojeto.strategy.seguro.service;

import br.com.padroesprojeto.strategy.form.Cliente;

public class CalculadoraPremioSeguroParaCarro implements CalculadoraPremioSeguro{

	@Override
	public double calcular(Cliente cliente, double valorVeiculo) {
		// TODO Auto-generated method stub
		return valorVeiculo*0.45;
	}

}
