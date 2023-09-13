package ejercicio03;

import java.sql.Date;
import java.util.ArrayList;

public class Hito {
	Date fechaEvento;
	String description;
	ArrayList<Persona> personasInvolucradas;
	
	
	public Hito(Date fechaEvento, String description) {
		super();
		this.fechaEvento = fechaEvento;
		this.description = description;
		this.personasInvolucradas = new ArrayList<Persona>();
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Persona> getPersonasInvolucradas() {
		return personasInvolucradas;
	}

	public void setPersonasInvolucradas(ArrayList<Persona> personasInvolucradas) {
		this.personasInvolucradas = personasInvolucradas;
	}
	
	public String getValor() {
		String result = getFechaEvento() + " - " + getDescription();
		
//	for (Persona p: this.personasInvolucradas ) {
//		result += "\n" 
//	}
//		
		return result;
	}
	

}
