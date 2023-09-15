package ar.ort.tp1.parcial1;

import java.util.ArrayList;

public class ZonaMonzonica extends Zona {
	final int MMLLOVIDOSLIMITE = 200;
	final int ELEVACIONLIMITE = 1000;
	final double LIMITETEMPERATURA = 15.0;
    private IntensidadViento intensidadViento;
    private int mmLlovidos;

    public ZonaMonzonica(int elevacion, ArrayList<Double> temperaturas, Coordenada coordenada, int mmLlovidos, IntensidadViento intensidadViento) {
        super(elevacion, temperaturas, coordenada);
        this.intensidadViento = intensidadViento;
        this.mmLlovidos = mmLlovidos;
    }

	private boolean algunaTemperaturaMenorA15(ArrayList<Double> temperaturas) {
        for (double temperatura : temperaturas) {
            if (temperatura < LIMITETEMPERATURA) {
                return true;
            }
        }
        return false;
	}
	
    @Override
    public boolean enRiesgo() {
    	boolean resultado = mmLlovidos >= MMLLOVIDOSLIMITE && getElevacion() <= ELEVACIONLIMITE || (intensidadViento == IntensidadViento.LEVE && algunaTemperaturaMenorA15(getTemperaturas()));
        return resultado;

    }

}