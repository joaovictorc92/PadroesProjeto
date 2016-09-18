package br.com.padroesprojeto.proxy;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Emails")
@XmlAccessorType (XmlAccessType.FIELD)
public class Emails {
	@XmlElement(name = "email")
	private Collection<String> email;

	public Collection<String> getEmail() {
		return email;
	}

	public void setEmail(Collection<String> email) {
		this.email = email;
	}
	
}
