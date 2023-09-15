package ar.ort.tp1.parcial1;

import java.util.ArrayList;

public class ZonaTropical extends Zona {
	final int MMLLOVIDOSLIMITE = 200;
	final int ELEVACIONLIMITE = 1000;
    private int mmLlovidos;

    public ZonaTropical(int elevacion, ArrayList<Double> temperaturas, Coordenada coordenada, int mmLlovidos) {
        super(elevacion, temperaturas, coordenada);
        this.mmLlovidos = mmLlovidos;
    }

    @Override
    public boolean enRiesgo() {
    	boolean resultado = mmLlovidos >= MMLLOVIDOSLIMITE && getElevacion() <= ELEVACIONLIMITE;
        return resultado;
    }
}