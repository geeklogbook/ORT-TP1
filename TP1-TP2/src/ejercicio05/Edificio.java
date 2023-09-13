package ejercicio05;

import java.util.ArrayList;

public class Edificio {
	private ArrayList<Vivienda> viviendas;
	
	public Edificio() {
		this.viviendas = new ArrayList<Vivienda>();
	}
	
	public void addVivienda(Vivienda vivienda) {
		this.viviendas.add(vivienda);
	}
	
	public ArrayList<Vivienda> getViviendas() {
		return viviendas;
	}

	public void setViviendas(ArrayList<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}
	
	public Vivienda buscarVivienda(String piso, String depto) {
		int cantViviendas = this.getViviendas().size();
		Vivienda viviendaEncontrada = null;
		int viviendaActual = 0;
		
		while (viviendaEncontrada == null  && cantViviendas > 0) {
			if(viviendas.get(viviendaActual).existeDepartamento(piso, depto)) {
				viviendaEncontrada = viviendas.get(viviendaActual);
			};

			viviendaActual++;
			cantViviendas--;
		}
		
		
		return viviendaEncontrada;
	}
	
	public String RealizarMundanza(String pisoOrg, String deptoOrg, String pisoDes, String deptoDes) {
		//Muebles Origne
		Vivienda viviendaOrg = buscarVivienda(pisoOrg, deptoOrg);
		ArrayList<Mueble> mueblesOrg = viviendaOrg.getMuebles();
		ArrayList<Persona> personasOrg = viviendaOrg.getPersonas();
		
		//Muebles Destino
		Vivienda viviendaDest = buscarVivienda(pisoDes, deptoDes);
		ArrayList<Mueble> mueblesDest = viviendaDest.getMuebles();
		ArrayList<Persona> personasDest = viviendaDest.getPersonas();
		
		//Movimiento Origen -> Destino
		viviendaDest.setPersonas(personasOrg);
		viviendaDest.setMuebles(mueblesOrg);
		//Movimeinto Destino -> Origen
		viviendaOrg.setMuebles(mueblesDest);
		viviendaOrg.setPersonas(personasDest);
		
		String result = "SE HA REALIZADO LA MUDANZA DEL " + pisoOrg + deptoOrg + " AL " + pisoDes + deptoDes;
		
		return result;
	}
	

	public void MostrarTodo() {
		for (Vivienda v: getViviendas()) {
			System.out.println(v.toString());
		}
	}
}
