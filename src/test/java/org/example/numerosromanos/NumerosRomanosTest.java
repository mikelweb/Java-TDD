package org.example.numerosromanos;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    public void uno() {
        String romano = numerosRomanos.convertirAromanos(1);
        assertEquals(romano, "I");
    }

    @Test
    public void dos() {
        String romano = numerosRomanos.convertirAromanos(2);
        assertEquals(romano, "II");
    }

    @Test
    public void tres() {
        String romano = numerosRomanos.convertirAromanos(3);
        assertEquals(romano, "III");
    }
    @Test
    public void seis() {
        String romano = numerosRomanos.convertirAromanos(6);
        assertEquals(romano, "VI");
    }

    @Test
    public void siete() {
        String romano = numerosRomanos.convertirAromanos(7);
        assertEquals(romano, "VII");
    }

    @Test
    public void ocho() {
        String romano = numerosRomanos.convertirAromanos(8);
        assertEquals(romano, "VIII");
    }
}
