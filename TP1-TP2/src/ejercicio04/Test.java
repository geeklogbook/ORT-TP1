package ejercicio04;

public class Test {

	public static void main(String[] args) {
		
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
		
		
		
		System.out.println("Vivienda 1");
		System.out.println(vivienda1.toString());
		
	}

}
