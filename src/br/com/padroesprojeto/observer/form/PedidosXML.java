package br.com.padroesprojeto.observer.form;

import java.net.URL;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class PedidosXML extends Pedidos{
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Pedido> getPedidos() {
		// TODO Auto-generated method stub
		return getPedidosXml();
	}
	
	public Collection<Pedido> getPedidosXml(){
		JAXBContext jaxbContext;
		Pedidos pedidos = null;
		try {
			jaxbContext = JAXBContext.newInstance(Pedidos.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			pedidos = (Pedidos)jaxbUnmarshaller.unmarshal(this.getClass().getResource("../resources/pedidos.xml"));

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pedidos.getPedidos();
	}

}
