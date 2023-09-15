package ar.ort.tp1.parcial1;

import java.util.ArrayList;
import java.util.Arrays;

/**
*/
public class Test {

	public static void main(String[] args) {
		// No hay nada que hacer aquí en el main...
		CentroDeMonitoreo centro = new CentroDeMonitoreo();
		
		agregarZonasDePrueba(centro);
		testearPorcentajeDeZonasEnRiesgo(centro);
		System.out.println("------------------");
		testearInformarRiesgo(centro);
	}
	
	private static void agregarZonasDePrueba (CentroDeMonitoreo centro) {
		ArrayList<Double> temps1 = new ArrayList<>(Arrays.asList(47.3, 45.2, 40.1, 46.8, 39.6, 48.0, 49.8));
		ArrayList<Double> temps2 = new ArrayList<>(Arrays.asList(35.5, 36.2, 34.8, 33.9, 35.7, 36.5));
		ArrayList<Double> temps3 = new ArrayList<>(Arrays.asList(28.7, 29.2, 30.5, 31.1, 29.8, 30.0, 28.3, 32.0, 28.9));
		ArrayList<Double> temps4 = new ArrayList<>(Arrays.asList(55.6, 54.8, 56.2, 57.3, 55.9));
		ArrayList<Double> temps5 = new ArrayList<>(Arrays.asList(15.2, 15.5, 15.3, 15.7, 15.1, 14.9, 15.5));
		ArrayList<Double> temps6 = new ArrayList<>(Arrays.asList(15.8, 15.3, 15.6, 15.7, 15.2, 15.8, 15.1));
		/*
		 *  TODO Usá las temperaturas anteriores para crear aquí las
		 *  zonas que pide el enunciado y agregarlas al centro
		 */
		Coordenada cSeca1 = new Coordenada(3,4);
		ZonaSeca seca1 = new ZonaSeca(2700, temps1, cSeca1, 87);
		centro.agregarZona(seca1);
		//TROPICAL1
		Coordenada cTropical1 = new Coordenada(0,2);
		ZonaTropical tropical1 = new ZonaTropical(1350, temps2, cTropical1, 256);
		centro.agregarZona(tropical1);
		//TROPICAL2
		Coordenada cTropical2 = new Coordenada(9,-6);
		ZonaTropical tropical2 = new ZonaTropical(900, temps3, cTropical2, 212);
		centro.agregarZona(tropical2);
		//SECA2
		Coordenada cSeca2 = new Coordenada(-2,7);
		ZonaSeca seca2 = new ZonaSeca(3100, temps4, cSeca2, 92);
		centro.agregarZona(seca2);
		//mONZONICA1
		Coordenada cMonzonica1 = new Coordenada(4,0);
		ZonaMonzonica monzonica1 = new ZonaMonzonica(2100, temps5, cMonzonica1, 110, IntensidadViento.LEVE);
		centro.agregarZona(monzonica1);
		//MONZONICA2
		Coordenada cMonzonica2 = new Coordenada(5,5);
		ZonaMonzonica monzonica2 = new ZonaMonzonica(1900, temps6, cMonzonica2, 115, IntensidadViento.LEVE);
		centro.agregarZona(monzonica2);
	}
	
	private static void testearPorcentajeDeZonasEnRiesgo (CentroDeMonitoreo centro) {
		// TODO Descomentar y completar
		System.out.println("Porcentaje de zonas en riesgo: " + centro.porcentajeDeZonasEnRiesgo() + "%");
	}
	
	private static void testearInformarRiesgo (CentroDeMonitoreo centro) {	
		// No hay nada que hacer aquí...
		centro.informarRiesgo(new Coordenada(3,4));
		centro.informarRiesgo(new Coordenada(0,2));
		centro.informarRiesgo(new Coordenada(9,-6));
		centro.informarRiesgo(new Coordenada(-2,7));
		centro.informarRiesgo(new Coordenada(4,0));
		centro.informarRiesgo(new Coordenada(5,5));
		centro.informarRiesgo(new Coordenada(0,0));
	}

}