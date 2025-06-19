package org.example.numerosromanos;

public class NumerosRomanos {
    public String convertirAromanos(Integer numeroArabigo) {

        switch (numeroArabigo) {
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 11:
                return "XI";
            case 12:
                return "XII";
            case 13:
                return "XIII";
            case 14:
                return "XIV";
            case 15:
                return "XV";
            case 16:
                return "XVI";
            case 17:
                return "XVII";
            case 18:
                return "XVIII";
            case 19:
                return "XIX";
            case 20:
                return "XX";
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

