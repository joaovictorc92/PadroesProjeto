package br.com.padroesprojeto.observer.form;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public abstract class Pedidos {
	public abstract Collection<Pedido> getPedidos();
	public abstract Collection<Pedido> carregaPedidos();
}
