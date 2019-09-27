
package cl.duoc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMontoBono {
    @Test
    public void testMontoBono() {
        System.out.println("MontoBono");
        String rut = "55555555";
        BussEmpleado instance = new BussEmpleado();
        int expResult = 200000;
        int result = instance.MontoBono(rut);
        assertEquals(expResult, result);
    }
}
