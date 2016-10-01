package br.com.padroesprojeto.observer.form;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pedidos")
@XmlAccessorType(XmlAccessType.FIELD)
public class PedidosXML extends Pedidos {
	@XmlElement(name = "pedido")
	public Collection<Pedido> listaPedidos;

	public PedidosXML() {
		listaPedidos = new ArrayList<Pedido>();
	}

	@SuppressWarnings("unchecked")
	@Override
	
	public Collection<Pedido> getPedidos() {
		// TODO Auto-generated method stub
		return listaPedidos;
	}
	
	public Collection<Pedido> carregaPedidos(){
		getPedidosXml();
		return getPedidos();
	}

	public void getPedidosXml() {
		JAXBContext jaxbContext;
		Pedidos pedidos = null;
		Object object;
		try {
			jaxbContext = JAXBContext.newInstance(this.getClass());
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			 pedidos =  (Pedidos) jaxbUnmarshaller
					.unmarshal(this.getClass().getResource("../resources/pedidos.xml"));
			 listaPedidos = pedidos.getPedidos();
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
