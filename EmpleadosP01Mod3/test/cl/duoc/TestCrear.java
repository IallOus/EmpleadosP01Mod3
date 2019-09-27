
package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCrear {
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado obj = new Empleado("12345345", "cinthya", 21, 1);
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = true;
        boolean result = instance.Crear(obj);
        assertEquals(expResult, result);
    }
}
