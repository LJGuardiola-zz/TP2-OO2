package idoneo;

public class LibroRegular extends Libro {

    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    public double getCosto(int diasAlquilados) {
        double costo = 2;
        if (diasAlquilados > 2)
            costo += (diasAlquilados - 2) * 1.5;
        return costo;
    }

}
