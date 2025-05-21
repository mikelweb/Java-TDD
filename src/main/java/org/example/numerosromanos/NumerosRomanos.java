package org.example.numerosromanos;

public class NumerosRomanos {
    public String convertirAromanos(int numeroArabigo) {

        if(numeroArabigo <= 3)
            return sumarI(1, numeroArabigo, "");

        return null;
    }

    private String sumarI(int inicioCuenta, int num, String inicioNumRomano) {
        for(int i = inicioCuenta; i <= num; i++) {
            inicioNumRomano += "I";
        }
        return inicioNumRomano;
    }

}
