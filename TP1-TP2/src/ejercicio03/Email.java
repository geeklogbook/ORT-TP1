package ejercicio03;

public class Email {
	private String cuenta;
	private String dominio;
	
	
	public Email(String email) {
		String[] parts = email.split("@");
		String cuenta = parts[0];
		String dominio = parts[1];
		this.cuenta = cuenta;
		this.dominio = dominio;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
	public String getValor() {
		return getCuenta() +"@" + getDominio();
	}
	

}
