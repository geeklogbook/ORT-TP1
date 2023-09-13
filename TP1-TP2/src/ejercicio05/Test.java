package ejercicio05;

public class Test {

	public static void main(String[] args) {
		
		// VIVIENDA 1
		Direccion direccionVivienda1 = new Direccion("Montañeses", "1234", "4", "C");
		Vivienda vivienda1 = new Vivienda(direccionVivienda1);
		Persona arturoRoman = new Persona("Roman", "Arturo",53);
		Persona monicaGaztambide = new Persona("Monica", "GaztambideArturo",35);
		vivienda1.addPersona(arturoRoman);
		vivienda1.addPersona(monicaGaztambide);
		Mueble mesaMadera = new Mueble("Mesa", "Madera", "Marrón");
		Mueble mesaMarmol = new Mueble("Mesa", "Mármol", "Rojo");
		Mueble percheroMetal = new Mueble("Perchero", "Metal", "Negro");
		Mueble sillonCuero = new Mueble("Sillon", "Cuero", "Azul");
		vivienda1.addMueble(mesaMadera);
		vivienda1.addMueble(mesaMarmol);
		vivienda1.addMueble(percheroMetal);
		vivienda1.addMueble(sillonCuero);
		
		//VIVIENDA 2
		Direccion direccionVivienda2 = new Direccion("Montañeses", "1234", "2", "B");
		Vivienda vivienda2 = new Vivienda(direccionVivienda2);
		
		Edificio edificio1 = new Edificio();
		edificio1.addVivienda(vivienda1);
		edificio1.addVivienda(vivienda2);
		edificio1.MostrarTodo();
		
		System.out.println();		
		System.out.println(edificio1.RealizarMundanza("4", "C", "2", "B"));
		System.out.println();
		
		edificio1.MostrarTodo();
		
		
//		System.out.println("Vivienda 1");
//		System.out.println(vivienda1.toString());
		
	}

}
