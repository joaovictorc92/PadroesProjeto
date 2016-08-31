package br.com.padroesprojeto.factorymethod;

public class ConsoleLogCreator extends Logger{

	@Override
	public LogPrinter createLogger() {
		return new ConsoleLogPrinter();
	}

}
