package trabajopractico01.ejercicio02;

import java.util.ArrayList;

public class Competencia {
	String nombreEspecialidad;
	ArrayList<Competidor> competidores; // Cada Elemento es el nombre del integrante
	
	public Competencia(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
		this.competidores = new ArrayList<Competidor>();
	}
	
	public void addCompetidor(Competidor competidor) {
		this.competidores.add(competidor);
	}
	
	public ArrayList<Competidor> ganadores(){
		ArrayList<Competidor> ganadores =  new ArrayList<Competidor>();
		double tiempoGanador = this.competidores.get(0).getSegundos();
		for (Competidor competidor: this.competidores) {
			if(competidor.getSegundos() < tiempoGanador) {
				ganadores.clear();
				ganadores.add(competidor);
				tiempoGanador = competidor.getSegundos();
			} else {
				if(competidor.getSegundos() == tiempoGanador) {
					ganadores.add(competidor);
					tiempoGanador = competidor.getSegundos();
				}
			}
		}
		
		return ganadores;
	}
	
	// Ejercicio 3 - Retorna una terna de 3 tiempos y los competitodes con los mismos
	public ArrayList<Competidor> ternaGanadores(){
		//GANADORES
		ArrayList<Competidor> ganadores =  new ArrayList<Competidor>();
		//TIEMPO GANADOR
		double tiempoPrimero = Integer.MAX_VALUE; // 
		double tiempoSegundo = Integer.MAX_VALUE; // tiempoPrimero < tiempoSegundo < tiempoTercero
		double tiempoTercero = Integer.MAX_VALUE; // 
		Posicion primero = null;
		Posicion segundo = null;
		Posicion tercero = null;

		
		for (Competidor competidor: this.competidores) {
			double tiempoCompetidor = competidor.getSegundos();
			
			if (tiempoCompetidor < tiempoPrimero) {
				segundo = primero;
				tiempoSegundo = tiempoPrimero;
				//
				primero = new Posicion(competidor);
				tiempoPrimero = tiempoCompetidor;				
			} else {
				if (tiempoCompetidor < tiempoSegundo) {
					tercero = segundo;
					tiempoTercero = tiempoSegundo;
					//
					segundo = new Posicion(competidor);
					tiempoSegundo = tiempoCompetidor;
				} else {
					if (tiempoCompetidor < tiempoTercero) {
						tercero = new Posicion(competidor);
						tiempoTercero = tiempoCompetidor;
					}
				}
			}
		}
		
		ganadores.add(primero.getCompetidor());
		ganadores.add(segundo.getCompetidor());
		ganadores.add(tercero.getCompetidor());
		return ganadores;
	}
	
	
	
	public void mostrarGanadores() {
		ArrayList<Competidor> ganadores = ganadores();
		for (Competidor ganador: ganadores) {
			System.out.println(ganador.getNombre() + " " + ganador.getSegundos());
		}
	}
	
	public void mostrarTernaGanadores() {
		System.out.println("Terna Ganadora");
		ArrayList<Competidor> ganadores = ternaGanadores();
		for (Competidor ganador: ganadores) {
			System.out.println(ganador.getNombre() + " " + ganador.getSegundos());
		}
	}
	
	
}