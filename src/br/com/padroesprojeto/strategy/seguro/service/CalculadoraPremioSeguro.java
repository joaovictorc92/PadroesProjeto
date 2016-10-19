package br.com.padroesprojeto.strategy.seguro.service;

import br.com.padroesprojeto.strategy.form.Cliente;

public interface CalculadoraPremioSeguro {
	public abstract double calcular(Cliente cliente,double valorVeiculo);
}
