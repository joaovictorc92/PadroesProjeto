package br.com.padroesprojeto.strategy.form;

public enum Sexo {
	MASCULINO (1), FEMININO(2);
	
	private int valor;
	
	Sexo(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
}
