package org.example.numerosromanos;

import java.util.Arrays;
import java.util.List;

public class NumerosRomanos {

    private final static List<String> simbolos = Arrays.asList("I","V","X","L","C","D","M");

    public String convertirAromanos(Integer numeroArabigo) {

        char[] numerosChar = numeroArabigo.toString().toCharArray();
        
        int incremento = 0;
        String resultado = "";
        for (int i = numerosChar.length - 1; i >= 0; i--) {
            String romano = generico(Character.getNumericValue(numerosChar[i]), 0 + incremento, 1 + incremento, 2 + incremento);
            resultado = romano + resultado;
            incremento += 2;
        }
        return resultado;
    }

    private String generico(int decena, int x, int y, int z) {
        switch (decena) {
            case 4:
                return simbolos.get(x) + simbolos.get(y);
            case 9:
                return simbolos.get(x) + simbolos.get(z);
        }
        if(decena <= 3)
            return sumar(1, decena, "", simbolos.get(x));

        if(decena <= 8)
            return sumar(6, decena, simbolos.get(y), simbolos.get(x));

        return null;

    }

/*
    private String pasarDecena(int decena) {
        switch (decena) {
            case 4:
                return "XL";
            case 9:
                return "XC";
        }

        if(decena <= 3)
            return sumar(1, decena, "", "X");

        if(decena <= 8)
            return sumar(6, decena, "L", "X");

        return null;

    }


    private String pasarUnidad(int unidad) {
        switch (unidad) {
            case 4:
                return "IV";
            case 9:
                return "IX";
        }

        if(unidad <= 3)
            return sumar(1, unidad, "", "I");

        if(unidad <= 8)
            return sumar(6, unidad, "V", "I");

        return null;
    }
    */

    private String sumar(int inicioCuenta, int num, String inicioNumRomano, String letra) {
        for(int i = inicioCuenta; i <= num; i++) {
            inicioNumRomano += letra;
        }
        return inicioNumRomano;
    }

}

