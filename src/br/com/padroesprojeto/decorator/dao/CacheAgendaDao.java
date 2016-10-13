package br.com.padroesprojeto.decorator.dao;

import java.util.Map;

import br.com.padroesprojeto.decorator.form.Contato;

public class CacheAgendaDao implements AgendaDAO{
	AgendaDaoImpl agendaDao;
	Map<Integer,Contato> contatos;
	
	public CacheAgendaDao(AgendaDaoImpl agendaDao){
		this.agendaDao = agendaDao;
	}
	
	@Override
	public void inserirContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contato buscar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
