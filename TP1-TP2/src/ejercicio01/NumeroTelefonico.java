package ejercicio01;

public class NumeroTelefonico {
	private long caracteristica;
	private long numeroDeAbonado;
	private long codigoPais;
	private TipoDeLinea tipoDeLinea;
	
		
	public NumeroTelefonico(long codigoPais, long caracteristica, long numeroDeAbonado, TipoDeLinea tipoDeLinea) {
		this.codigoPais = codigoPais;
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public long getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(long caracteristica) {
		this.caracteristica = caracteristica;
	}
	public long getNumeroDeAbonado() {
		return numeroDeAbonado;
	}
	public void setNumeroDeAbonado(long numeroDeAbonado) {
		this.numeroDeAbonado = numeroDeAbonado;
	}
	public long getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(long codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getTipoDeLinea() {
		String resultStr = this.tipoDeLinea.name();
		return resultStr.substring(0, 1) + resultStr.substring(1).toLowerCase();
	}
	public void setTipoDeLinea(TipoDeLinea tipoDeLinea) {
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public String getValor() {
		String resultado =  this.getTipoDeLinea() + ": (+" + this.getCodigoPais() +") "+this.getCaracteristica() +"-"+ this.getNumeroDeAbonado();
		
		return resultado;
	}

}
