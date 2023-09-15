package ar.ort.tp1.parcial1;

import java.util.ArrayList;

public class ZonaSeca extends Zona {
	final double TEMPERATURAPROMEDIOLIMITE = 43.0;
	final double PORCENTAJEINSOLACIONLIMITE = 90.0;
    private double porcentajeInsolacion;

    public ZonaSeca(int elevacion, ArrayList<Double> temperaturas, Coordenada coordenada, double porcentajeInsolacion) {
        super(elevacion, temperaturas, coordenada);
        this.porcentajeInsolacion = porcentajeInsolacion;
    }
    
    private double sumarTemperaturas(ArrayList<Double> temperaturas) {
        double suma = 0;
        for (double temperatura : temperaturas) {
            suma += temperatura;
        }
        return suma;
    }

    @Override
    public boolean enRiesgo() {
    	double temperaturas = sumarTemperaturas(this.getTemperaturas());
    	int cantidad = this.getTemperaturas().size();
        double temperaturaPromedio = Matematica.promedio(temperaturas, cantidad);
        return temperaturaPromedio > TEMPERATURAPROMEDIOLIMITE && porcentajeInsolacion < PORCENTAJEINSOLACIONLIMITE;
    }
}