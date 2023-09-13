package ejercicio04;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(Direccion direccion) {
		this.direccion = direccion;
		this.personas = new ArrayList<Persona>();
		this.muebles = new ArrayList<Mueble>();
	}
	
	public void addPersona(Persona persona) {
		this.personas.add(persona);
	}
	
	public void addMueble(Mueble mueble) {
		this.muebles.add(mueble);
	}
	
	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}


	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}


	public void setMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;
	}

	
	@Override
	public String toString() {
		String resultado = this.getDireccion().getValor() + "\n" + "Personas: " + this.personas + "\n" + "Muebles: " + this.getMuebles();
		
		return resultado;
	}

}
