package br.com.padroesprojeto.observer.form;

import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class PedidosXML implements Pedidos{

	@Override
	public Collection<Pedido> getPedidos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Collection<Pedido> getPedidosXml(){
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Pedidos.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			jaxbUnmarshaller.unmarshal(getClass().getResource("resources/pedidos.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
