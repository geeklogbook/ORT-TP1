package ejercicio02;

public class Test {

	public static void main(String[] args) {		
		String apellido = "Messi";
		String nombre = "Lionel";
		Persona leoMessi = new Persona(apellido, nombre);
		NumeroTelefonico celular1 = new NumeroTelefonico(549,114111,2222,TipoDeLinea.CELULAR);
		NumeroTelefonico celular2 = new NumeroTelefonico(68, 032444, 5678,TipoDeLinea.CELULAR);
		NumeroTelefonico fijo1 = new NumeroTelefonico(054,4411,5472,TipoDeLinea.FIJO);
		Email email = new Email("lio@messi.com");
		Mascota pluto = new Mascota("Perro", "Pluto");
		Mascota felix = new Mascota("Gato", "Felix");
		Mascota bugs = new Mascota("Conejo", "Bugs");
		
		leoMessi.addMascota(pluto);
		leoMessi.addMascota(felix);
		leoMessi.addMascota(bugs);
		leoMessi.addEmail(email);
		leoMessi.addTelefono(celular1);
		leoMessi.addTelefono(celular2);
		leoMessi.addTelefono(fijo1);
		
		leoMessi.removeMascota(pluto);
		
		leoMessi.mostrarTodo();


	}

}
