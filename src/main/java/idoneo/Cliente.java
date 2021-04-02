package idoneo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cliente {

    private final String nombre;

    private final List<Alquiler> alquileres = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void alquilar(Libro libro, int dias) {
        alquileres.add(new Alquiler(libro, dias));
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        double deuda = 0;
        int puntos = 0;
        for (Alquiler alquiler : alquileres) {
            deuda += alquiler.calcularCosto();
            puntos += alquiler.calcularPuntosObtenidos();
        }
        return new Object[] {deuda, puntos};
    }

    private static class Alquiler {

        private final Libro libro;
        private final int diasAlquilados;

        private Alquiler(Libro libro, int diasAlquilados) {
            this.libro = libro;
            this.diasAlquilados = diasAlquilados;
        }

        private double calcularCosto() {
            return libro.getCosto(diasAlquilados);
        }

        private int calcularPuntosObtenidos() {
            return libro.getPuntos(diasAlquilados);
        }

    }

}
