package ejercicio05;

public class Direccion {
	private String calle;
	private String altura;
	private String piso;
	private String departamento;
	
	
	public Direccion(String calle, String altura, String piso, String departamento) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getValor() {
		String resultado = this.getCalle() + " " + this.getAltura() + " " + this.getPiso() + "°" + "”"+ this.getDepartamento() +"”";
		
		return resultado;
	}
}
