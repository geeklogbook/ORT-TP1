package ar.ort.tp1.parcial1;

import java.util.ArrayList;
import java.util.List;

/**
*/
public class CentroDeMonitoreo {
    private List<Zona> zonas = new ArrayList<>();

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public double porcentajeDeZonasEnRiesgo() {
        int zonasEnRiesgo = 0;
        for (Zona zona : zonas) {
            if (zona.enRiesgo()) {
                zonasEnRiesgo++;
            }
        }
        return Matematica.porcentaje(zonasEnRiesgo, zonas.size());
    }

    public void informarRiesgo(Coordenada coordenada) {
        boolean encontrado = false;
        for (Zona zona : zonas) {
            if (zona.getCoordenada().coincideCon(coordenada)) {
                if (zona.enRiesgo()) {
                    System.out.println("La zona en coordenadas " + coordenada + " está en riesgo.");
                } else {
                    System.out.println("La zona en coordenadas " + coordenada + " no está en riesgo.");
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró una zona para las coordenadas " + coordenada);
        }
    }
}