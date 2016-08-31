package br.com.padroesprojeto.factorymethod;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Logger {

	public abstract LogPrinter createLogger();

	public void log(String message) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date date = new Date();
		message += " SAÍDA DO CONSOLE " + dateFormat.format(date);
		LogPrinter printer = createLogger();
		printer.print(message);
	}

}
