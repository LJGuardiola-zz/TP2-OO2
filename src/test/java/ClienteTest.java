import idoneo.Cliente;
import idoneo.Libro;
import idoneo.LibroRegular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    void cliente_alquila_y_genera_deuda() {

/*        Libro elTunel = new Libro("El Túnel", Libro.REGULARES);
        Libro antesDelFin = new Libro("Antes del Fin", Libro.REGULARES);

        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

        Cliente yo = new Cliente("Javier");

        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);

        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

        Assertions.assertArrayEquals(new Object[] {10.0,2}, resultado);*/

        Libro elTunel = new LibroRegular("El Túnel");
        Libro antesDelFin = new LibroRegular("Antes del Fin");

        Cliente cliente = new Cliente("Jorge");

        cliente.alquilar(elTunel, 5);
        cliente.alquilar(antesDelFin, 3);

        Assertions.assertArrayEquals(new Object[] {10.0,2}, cliente.calcularDeudaYPuntosObtenidos());

    }

}
