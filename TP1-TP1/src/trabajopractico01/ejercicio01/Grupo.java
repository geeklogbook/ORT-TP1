package trabajopractico01.ejercicio01;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	ArrayList<String> integrantes; // Cada Elemento es el nombre del integrante
	
	public Grupo(String nombre) {
		this.integrantes = new ArrayList<String>();
		setNombre(nombre);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrantes(String nombreIntegrante) {
		if (buscarintegrante(nombreIntegrante) == null) {
			this.integrantes.add(nombreIntegrante);
			System.out.println(nombreIntegrante + " fue asignado al grupo " + getNombre());
		}
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int posicionIntegrante = -1;
		
		if (this.integrantes.indexOf(nombreIntegrante) > -1) {
			posicionIntegrante = this.integrantes.indexOf(nombreIntegrante) ;
		}
		
		return posicionIntegrante;
	}
	
	public String obtenerIntegrante(int posicion){
		String integrante = null;
		int posAbuscar = posicion - 1;
		if (posicion >= 1 && this.integrantes.size() >= posicion) {
			integrante = this.integrantes.get(posAbuscar);
		}
			
		return integrante;
	}
	
	public String buscarintegrante(String nombre) {
		String integrante = null;
		int posicionIntegrante = obtenerPosicionIntegrante(nombre);
		integrante = obtenerIntegrante(posicionIntegrante + 1);
		
		return integrante;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String integranteRemovido = buscarintegrante(nombreIntegrante);
		this.integrantes.remove(integranteRemovido);
		
		return integranteRemovido;
	}
	
	private void mostrarIntegrantes() {
		System.out.println("Cantidad de Integrantes: " + getCantidadIntegrantes());
		if (getCantidadIntegrantes() > 0) {
			System.out.print("Nombre de los integrantes: ");
			this.integrantes.forEach(
					(integrante) -> System.out.print(integrante + " "));
			System.out.println();
		}
	}
	
	public void mostrar() {
		System.out.println("Nombre del grupo: " + this.getNombre());
		mostrarIntegrantes();
	}
	
	public void vaciar() {
		this.integrantes.clear();
	}
}