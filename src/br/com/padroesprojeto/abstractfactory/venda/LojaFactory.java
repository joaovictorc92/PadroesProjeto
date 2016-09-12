package br.com.padroesprojeto.abstractfactory.venda;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import br.com.padroesprojeto.abstractfactory.boleto.Boleto;
import br.com.padroesprojeto.abstractfactory.notafiscal.NFe;

public class LojaFactory implements ModuloVendaFactory {
	Properties properties;

	public LojaFactory() {
		properties = new Properties();
		loadProperties();

	}

	@Override
	public NFe criarNFe() {
		// TODO Auto-generated method stub
		NFe nfe = null;
		try {
			nfe = (NFe) Class.forName(properties.getProperty("nfe.ma")).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nfe;
	}

	@Override
	public Boleto criarBoleto() {
		// TODO Auto-generated method stub
		Boleto boleto = null;
		try {
			boleto = (Boleto) Class.forName(properties.getProperty("boleto.cef")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return boleto;
	}

	public void loadProperties() {
		try{
			FileInputStream file = new FileInputStream("./properties/venda.properties");
			properties.load(file);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
