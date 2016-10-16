package br.com.padroesprojeto.decorator.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.padroesprojeto.decorator.form.Contato;

public class CacheAgendaDao implements AgendaDAO{
	AgendaDaoImpl agendaDao;
	Map<Integer,Contato> contatos;
	
	public CacheAgendaDao(AgendaDaoImpl agendaDao){
		this.agendaDao = agendaDao;
		this.contatos = new HashMap<Integer, Contato>();
	}
	
	@Override
	public void inserirContato(Contato contato) {
		this.agendaDao.inserirContato(contato);
		carregarContatos();
		this.contatos.put(contato.getCodigo(), contato);
		
	}

	@Override
	public Contato buscar(int codigo) {
		// TODO Auto-generated method stub
		carregarContatos();
		return this.contatos.get(codigo);
	}
	
	public void carregarContatos(){
		if(this.contatos.isEmpty()){
			for(Contato c : this.agendaDao.carregarContatos()){
				this.contatos.put(c.getCodigo(), c);
			}
		}
	}

}
