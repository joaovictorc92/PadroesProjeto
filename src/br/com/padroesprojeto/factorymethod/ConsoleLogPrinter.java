package br.com.padroesprojeto.factorymethod;

public class ConsoleLogPrinter implements LogPrinter {

	@Override
	public void print(String message) {
		System.out.println(message);
	}

}
