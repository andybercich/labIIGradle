import EjercicioII.Banco;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BancoTest {
    static Banco b = new Banco();

    @BeforeAll
    static void setupAll() throws Exception {
        System.out.println("Ejecutar configuracion antes de todas las pruebas.");
        b.crearCuenta("457b",0);
        b.crearCuenta("014fr",1500);
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Ejecutar limpieza despues de todas las pruebas.");
    }

    @Test
    @DisplayName("Prueba Agregar Cuenta Saldo Inicial")
    void probarAgregacionCuentas() throws Exception {

        Assertions.assertEquals(b.crearCuenta("784a",45),true);

    }

    @Test
    @DisplayName("Prueba Comprobaciones de saldo de cuentas Existentes e inexistentes")
    void probarComprobacionSaldo() throws Exception {

        Assertions.assertEquals(b.comprobacionSaldo("457b"),0);

        assertThrows(Exception.class, () -> {
            b.comprobacionSaldo("457");
        });

    }

    @Test
    @DisplayName("Prueba Depósitos con Saldos Positivos y Negativos")
    void probarDepositos() throws Exception {

        Assertions.assertEquals(b.ingresar("457b",450), true);
        assertThrows(Exception.class, () -> {
            b.ingresar("457b",-85);
        });

    }

    @Test
    @DisplayName("Prueba Extraccion con Saldos Positivos y Negativos")
    void probarExtraccion() throws Exception {

        Assertions.assertEquals(b.ingresar("457b",450), true);
        Assertions.assertEquals(b.retirar("457b",450), true);
        assertThrows(Exception.class, () -> {
            b.retirar("457b",-85);
        });
        assertThrows(Exception.class, () -> {
            b.retirar("457b",460);
        });


    }


}
