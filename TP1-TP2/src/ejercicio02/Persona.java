package ejercicio02;

import java.util.ArrayList;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefonos = new ArrayList<NumeroTelefonico>();
		this.emails = new ArrayList<Email>();
		this.mascotas = new ArrayList<Mascota>();
	}
	
	public void addTelefono(NumeroTelefonico telefono) {
		telefonos.add(telefono);
	}
	
	public void removeTelefono(NumeroTelefonico telefono) {
		telefonos.remove(telefono);
	}
	
	public void addEmail(Email email) {
		emails.add(email);
	}
	
	public void removeEmail(Email email) {
		emails.remove(email);
	}
	
	public void addMascota(Mascota mascota) {
		mascotas.add(mascota);
	}
	
	public void removeMascota(Mascota mascota) {
		mascotas.remove(mascota);
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void mostrarTodo() {
		String nombre_y_apellido = getApellido() +", " + getNombre();
		System.out.println(nombre_y_apellido);
		System.out.println("Número de teléfonos: ");
		for (NumeroTelefonico n: telefonos) {
			System.out.println(n.getValor());
		}
		System.out.println("Email");
		for (Email m: emails) {
			System.out.println(m.getValor());
		}
		System.out.println("Mascotas: ");
		for (Mascota ma: mascotas) {
			System.out.println(ma.getValor());
		}
	}

}
