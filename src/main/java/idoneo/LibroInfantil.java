package idoneo;

public class LibroInfantil extends Libro {

    public LibroInfantil(String nombre) {
        super(nombre);
    }

    @Override
    public double getCosto(int diasAlquilados) {
        double costo = 1.5;
        if (diasAlquilados > 3)
            costo += (diasAlquilados - 3) * 1.5;
        return costo;
    }

}
