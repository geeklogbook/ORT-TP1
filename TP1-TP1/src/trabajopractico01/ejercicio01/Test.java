package trabajopractico01.ejercicio01;

public class Test {

	public static void main(String[] args) {
		System.out.println("Inicio ejercicio 1");
		Grupo grupo_a = new Grupo("grupo_a");
		

		System.out.println("AGREGAR INTEGRANTES");
		grupo_a.agregarIntegrantes("Federico ");
		grupo_a.agregarIntegrantes("Joaquín Chemile");
		grupo_a.agregarIntegrantes("Lucina Nigro"); 
		grupo_a.agregarIntegrantes("Lucina Nigro"); // Repetido -> no se agrega
		grupo_a.agregarIntegrantes("Integrante Ficticio");
		grupo_a.agregarIntegrantes("Juan Manuel");
		grupo_a.agregarIntegrantes("Valentín");
		grupo_a.mostrar();
		
		// REMOVER INTEGRANTE FICTICIO:
		grupo_a.removerIntegrante("Integrante Ficticio");
		grupo_a.removerIntegrante("Integrante Ficticio");
		grupo_a.mostrar();
		
		//Vaciar Y Volver a mostrar
		grupo_a.vaciar();
		grupo_a.mostrar();
	}
}

