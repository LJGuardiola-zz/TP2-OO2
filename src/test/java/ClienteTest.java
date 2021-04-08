import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import refactor.Cliente;
import refactor.Libro;
import refactor.LibroRegular;

public class ClienteTest {

    @Test
    void cliente_alquila_y_genera_deuda() {

        Libro elTunel = new LibroRegular("El Túnel");
        Libro antesDelFin = new LibroRegular("Antes del Fin");

        Cliente cliente = new Cliente("Jorge");

        cliente.alquilar(elTunel, 5);
        cliente.alquilar(antesDelFin, 3);

        Assertions.assertArrayEquals(new Object[]{10.0, 2}, cliente.calcularDeudaYPuntosObtenidos());

    }

}
