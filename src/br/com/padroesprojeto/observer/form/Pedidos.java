package br.com.padroesprojeto.observer.form;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "pedidos")
@XmlAccessorType (XmlAccessType.FIELD)
public abstract class Pedidos {
	@XmlElement(name = "pedido")
	public abstract Collection<Pedido> getPedidos();
}
