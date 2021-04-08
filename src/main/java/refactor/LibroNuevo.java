package refactor;

public class LibroNuevo extends Libro {

    public LibroNuevo(String nombre) {
        super(nombre);
    }

    @Override
    public double obtenerCosto(int diasAlquilados) {
        return diasAlquilados * 3;
    }

    @Override
    public int getPuntos(int diasAlquilados) {
        return super.getPuntos(diasAlquilados) + diasAlquilados > 1 ? 1 : 0;
    }

}
