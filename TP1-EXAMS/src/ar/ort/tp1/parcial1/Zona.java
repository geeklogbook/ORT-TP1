package ar.ort.tp1.parcial1;

import java.util.ArrayList;

/**
*/
public class Zona {

	private int elevacion;
	private ArrayList<Double> temperaturas;
	private Coordenada coordenada;	

    public Zona(int elevacion, ArrayList<Double> temperaturas, Coordenada coordenada) {
        this.elevacion = elevacion;
        this.temperaturas = temperaturas;
        this.coordenada = coordenada;
    }
    
    public int getElevacion() {
        return elevacion;
    }

    public ArrayList<Double> getTemperaturas() {
        return temperaturas;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public boolean enRiesgo() {
        return false; 
    }
    
}