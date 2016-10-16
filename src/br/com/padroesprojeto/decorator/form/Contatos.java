package br.com.padroesprojeto.decorator.form;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="contatos")
public class Contatos extends ArrayList<Contato>{
	@XmlElement(name="contato")
	public ArrayList<Contato> getListaContato(){
		return this;
	}
}
