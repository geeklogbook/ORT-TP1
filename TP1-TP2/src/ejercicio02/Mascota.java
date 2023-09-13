package ejercicio02;

public class Mascota {
	private String nombre;
	private String tipo;
	
	public Mascota(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getValor() {
		String resultado = this.tipo + ", " + this.nombre;
		
		return resultado;
	}
	
	
	
}
