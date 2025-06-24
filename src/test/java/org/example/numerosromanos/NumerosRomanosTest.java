package org.example.numerosromanos;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
    public void cuatro() {
        String romano = numerosRomanos.convertirAromanos(4);
        assertEquals(romano, "IV");
    }

    @Test
    public void cinco() {
        String romano = numerosRomanos.convertirAromanos(5);
        assertEquals(romano, "V");
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

    @Test
    public void nueve() {
        String romano = numerosRomanos.convertirAromanos(9);
        assertEquals(romano, "IX");
    }

    @Test
    public void diez() {
        String romano = numerosRomanos.convertirAromanos(10);
        assertEquals(romano, "X");
    }
    @Test
    public void once() {
        String romano = numerosRomanos.convertirAromanos(11);
        assertEquals(romano, "XI");
    }

    @Test
    public void doce() {
        String romano = numerosRomanos.convertirAromanos(12);
        assertEquals(romano, "XII");
    }

    @Test
    public void trece() {
        String romano = numerosRomanos.convertirAromanos(13);
        assertEquals(romano, "XIII");
    }

    @Test
    public void catorce() {
        String romano = numerosRomanos.convertirAromanos(14);
        assertEquals(romano, "XIV");
    }

    @Test
    public void quince() {
        String romano = numerosRomanos.convertirAromanos(15);
        assertEquals(romano, "XV");
    }

    @Test
    public void dieciseis() {
        String romano = numerosRomanos.convertirAromanos(16);
        assertEquals(romano, "XVI");
    }

    @Test
    public void diecisiete() {
        String romano = numerosRomanos.convertirAromanos(17);
        assertEquals(romano, "XVII");
    }

    @Test
    public void dieciocho() {
        String romano = numerosRomanos.convertirAromanos(18);
        assertEquals(romano, "XVIII");
    }

    @Test
    public void diecinueve() {
        String romano = numerosRomanos.convertirAromanos(19);
        assertEquals(romano, "XIX");
    }

    @Test
    public void veinte() {
        String romano = numerosRomanos.convertirAromanos(20);
        assertEquals(romano, "XX");
    }

    @Test
    public void verificarTreintena() {
        List<Integer> treintena = Arrays.asList(30,31,32,33,34,35,36,37,38,39);

        List<String> romanos = treintena.stream().map(
                number -> numerosRomanos.convertirAromanos(number)
        ).collect(Collectors.toList());

        assertEquals(romanos.get(0), "XXX");
        assertEquals(romanos.get(1), "XXXI");
        assertEquals(romanos.get(2), "XXXII");
        assertEquals(romanos.get(3), "XXXIII");
        assertEquals(romanos.get(4), "XXXIV");
        assertEquals(romanos.get(5), "XXXV");
        assertEquals(romanos.get(6), "XXXVI");
        assertEquals(romanos.get(7), "XXXVII");
        assertEquals(romanos.get(8), "XXXVIII");
        assertEquals(romanos.get(9), "XXXIX");
    }

    @Test
    public void verificarDecenas() {
        List<Integer> decenas = Arrays.asList(40, 50, 60, 70, 80, 90);

        List<String> romanos = decenas.stream().map(
                number -> numerosRomanos.convertirAromanos(number)
        ).collect(Collectors.toList());

        assertEquals(romanos.get(0), "XL");
        assertEquals(romanos.get(1), "L");
        assertEquals(romanos.get(2), "LX");
        assertEquals(romanos.get(3), "LXX");
        assertEquals(romanos.get(4), "LXXX");
        assertEquals(romanos.get(5), "XC");
    }

    @Test
    public void verificarCentenas() {
        List<Integer> centenas = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900);

        List<String> romanos = centenas.stream().map(
                number -> numerosRomanos.convertirAromanos(number)
        ).toList();

        assertEquals(romanos.get(0), "C");
        assertEquals(romanos.get(1), "CC");
        assertEquals(romanos.get(2), "CCC");
        assertEquals(romanos.get(3), "CD");
        assertEquals(romanos.get(4), "D");
        assertEquals(romanos.get(5), "DC");
        assertEquals(romanos.get(6), "DCC");
        assertEquals(romanos.get(7), "DCCC");
        assertEquals(romanos.get(8), "CM");
    }

    @Test
    public void verificarRand() {
        List<Integer> random = Arrays.asList(23, 37, 98, 87, 21, 55, 101, 347, 798, 933, 3234);

        List<String> romanos = random.stream().map(
                number -> numerosRomanos.convertirAromanos(number)
        ).toList();

        assertEquals(romanos.get(0), "XXIII");
        assertEquals(romanos.get(1), "XXXVII");
        assertEquals(romanos.get(2), "XCVIII");
        assertEquals(romanos.get(3), "LXXXVII");
        assertEquals(romanos.get(4), "XXI");
        assertEquals(romanos.get(5), "LV");
        assertEquals(romanos.get(6), "CI");
        assertEquals(romanos.get(7), "CCCXLVII");
        assertEquals(romanos.get(8), "DCCXCVIII");
        assertEquals(romanos.get(9), "CMXXXIII");
        assertEquals(romanos.get(10), "MMMCCXXXIV");
    }
}