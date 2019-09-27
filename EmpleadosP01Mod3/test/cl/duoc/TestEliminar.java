
package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestEliminar {
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "12345345";
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = true;
        boolean result = instance.Eliminar(rut);
        assertEquals(expResult, result);
    }
}
