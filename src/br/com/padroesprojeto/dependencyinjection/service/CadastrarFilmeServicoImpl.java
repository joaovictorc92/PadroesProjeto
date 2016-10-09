package br.com.padroesprojeto.dependencyinjection.service;

import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import br.com.padroesprojeto.dependencyinjection.form.Filme;
import br.com.padroesprojeto.dependencyinjection.form.Tipo;
import br.com.padroesprojeto.dependencyinjection.repository.Filmes;

public class CadastrarFilmeServicoImpl implements CadastrarFilmeServico {
	@Inject
	Filmes filmes;

	@Override
	public void cadastrarFilme(Filme filme) {
		if(isAntigo(filme.getDataLancamento()))  
			filme.setTipo(Tipo.ANTIGO);
		else
			filme.setTipo(Tipo.NOVO);
		
		filmes.salvar(filme);
		
	}

	public boolean isAntigo(Date data) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -3);
		boolean antigo = data.before(calendar.getTime());
		return antigo;
	}

}
