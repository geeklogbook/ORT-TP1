package trabajopractico01.ejercicio02;

public class JuegosOlimpicos {
	
	public static void main(String[] args) {
		System.out.println("Se inician los JJOO");
		
		Competencia atletismo = new Competencia("atletismo");
		
		Competidor competidor_1 = new Competidor("Juan", 21.2);
		Competidor competidor_2 = new Competidor("Daniela", 9.3);
		Competidor competidor_3 = new Competidor("Jose", 9.2);
		Competidor competidor_4 = new Competidor("Josefina", 9.5);
		Competidor competidor_5 = new Competidor("Carlos", 12);
		Competidor competidor_6 = new Competidor("Pedro", 13.2);
		Competidor competidor_7 = new Competidor("Laura", 9.5);
		Competidor competidor_8 = new Competidor("Ramon", 9.2);
		Competidor competidor_9 = new Competidor("Maria", 9.4);
		Competidor competidor_10 = new Competidor("Mirko", 9);
		
		atletismo.addCompetidor(competidor_1);
		atletismo.addCompetidor(competidor_2);
		atletismo.addCompetidor(competidor_3);
		atletismo.addCompetidor(competidor_4);
		atletismo.addCompetidor(competidor_5);
		atletismo.addCompetidor(competidor_6);
		atletismo.addCompetidor(competidor_7);
		atletismo.addCompetidor(competidor_8);
		atletismo.addCompetidor(competidor_9);
		atletismo.addCompetidor(competidor_10);
		
		atletismo.mostrarGanadores();
		atletismo.mostrarTernaGanadores();
		
	}
}
