package br.com.padroesprojeto.factorymethod;

public class FactoryMethod {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogCreator();
		logger.log("LOG DO CONSOLE");

	}

}
