package idoneo;

import java.util.Objects;

public abstract class Libro {

    private final String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getCosto(int diasAlquilados);

    public int getPuntos(int diasAlquilados) {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return nombre.equals(libro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

}
