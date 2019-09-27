
package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBuscar {
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        BussEmpleado instance = new BussEmpleado();
        String expResult = "11111111";
        Empleado result = instance.Buscar(rut);
        assertEquals(expResult, result.getRut());
    }
}
