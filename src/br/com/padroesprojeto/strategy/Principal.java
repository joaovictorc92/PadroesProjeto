package br.com.padroesprojeto.strategy;

import java.util.Scanner;

import br.com.padroesprojeto.strategy.form.Cliente;
import br.com.padroesprojeto.strategy.form.Sexo;
import br.com.padroesprojeto.strategy.form.TipoVeiculo;
import br.com.padroesprojeto.strategy.seguro.service.CalculadoraPremioSeguro;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cliente cliente = new Cliente();
		System.out.println("Nome do cliente:");
		cliente.setNome(scanner.nextLine());
		System.out.println("Idade:");
		cliente.setIdade(scanner.nextInt());
		System.out.println("Sexo (1)- MASCULINO (2)- FEMININO: ");
		Sexo sexo = Sexo.values()[scanner.nextInt() - 1];
		cliente.setSexo(sexo);
		System.out.println(sexo);
		while(true){
			System.out.println("Tipo do Veículo (1)- Carro (2) - Moto:");
			TipoVeiculo tipoVeiculo = TipoVeiculo.values()[scanner.nextInt()-1];
			CalculadoraPremioSeguro calculadoraPremioSeguro = tipoVeiculo.obterSeguro();
			System.out.println("Valor do veículo:");
			double valorVeiculo = scanner.nextDouble();
			System.out.println("Valor do seguro R$ "+calculadoraPremioSeguro.calcular(cliente, valorVeiculo));
		}

	}

}
