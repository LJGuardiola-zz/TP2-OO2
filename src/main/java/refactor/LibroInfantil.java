package refactor;

public class LibroInfantil extends Libro {

    public LibroInfantil(String nombre) {
        super(nombre);
    }

    @Override
    public double obtenerCosto(int diasAlquilados) {
        double costo = 1.5;
        if (diasAlquilados > 3) {
            costo += (diasAlquilados - 3) * 1.5;
        }
        return costo;
    }

}
