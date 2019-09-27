
package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestModificar {
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado obj = new Empleado("11111112", "joaquin", 22, 2);;
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(obj);
        boolean expResult = true;
        boolean result = instance.Modificar(obj);
        assertEquals(expResult, result);
    }
}
