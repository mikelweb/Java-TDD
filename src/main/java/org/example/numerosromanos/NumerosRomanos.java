package org.example.numerosromanos;

public class NumerosRomanos {
    public String convertirAromanos(int numeroArabigo) {

        switch (numeroArabigo) {
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
        }

        if(numeroArabigo <= 3)
            return sumarI(1, numeroArabigo, "");

        if(numeroArabigo <= 8)
            return sumarI(6, numeroArabigo, "V");
        return null;
    }

    private String sumarI(int inicioCuenta, int num, String inicioNumRomano) {
        for(int i = inicioCuenta; i <= num; i++) {
            inicioNumRomano += "I";
        }
        return inicioNumRomano;
    }

}
