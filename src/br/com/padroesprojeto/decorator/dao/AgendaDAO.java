package br.com.padroesprojeto.decorator.dao;

import br.com.padroesprojeto.decorator.form.Contato;

public interface AgendaDAO {
	public abstract void inserirContato(Contato contato);
	public abstract Contato buscar(int codigo);
}
