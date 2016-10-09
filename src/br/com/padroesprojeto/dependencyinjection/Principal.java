package br.com.padroesprojeto.dependencyinjection;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import br.com.padroesprojeto.dependencyinjection.form.Filme;
import br.com.padroesprojeto.dependencyinjection.service.CadastrarFilmeServico;
import br.com.padroesprojeto.dependencyinjection.weld.WeldContext;

public class Principal {

	public static void main(String[] args) throws ParseException {
		String nome,data;
		Filme filme;
		nome = JOptionPane.showInputDialog("Digite o nome do filme", "NOME DO FILME");
		data = JOptionPane.showInputDialog("Digite data de lançamento de "+ nome, "formato ddd/mmm/aaaa");
		
		filme = new Filme();
		filme.setNome(nome);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		filme.setDataLancamento(simpleDateFormat.parse(data));
		
		CadastrarFilmeServico cadastrarFilmeServico = WeldContext.INSTANCE.getBean(CadastrarFilmeServico.class);
		cadastrarFilmeServico.cadastrarFilme(filme);
		
	}

}
