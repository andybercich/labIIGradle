import EjercicioI.Usuario;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UsuarioTest {

    static Usuario u = new Usuario();

    @BeforeAll
    static void setupAll() throws Exception {
        System.out.println("Ejecutar configuracion antes de todas las pruebas.");
        u.setNombre("Andy");
        u.setEdad(20);
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Ejecutar limpieza despues de todas las pruebas.");
    }
    @Test
    @DisplayName("Prueba Nombre")
    void probarNombre(){



        Assertions.assertEquals("Andy", u.getNombre());

    }
    @Test
    @DisplayName("Prueba Edad")
    void probarEdad(){


        Assertions.assertEquals(20, u.getEdad());

    }

    @Test
    @DisplayName("Prueba Edad Negativa")
    void probarEdadNegativa() throws Exception {


        assertThrows(Exception.class, () -> {
            u.setEdad(-4);
        });

    }


}
