package com.pronoob.basicos;

public class Bucles {
    public static void main(String[] args) {
        // Vamos a hacer 3 secuencias de numeros con los bucles
        // for, while y do-while

        /*
        Las secuencias numericas son:
        1,2,3,4,5,6,7,8,9,10
        1,99,2,98,3,97,4,96,5,95
        0,1,1,2,3,5,6,13,21,34 (Fibonacci)
         */

        int nDeRepeticiones = 100;

        // Primera secuencia
        for (int i = 1; i <= nDeRepeticiones; i++) {
            if (i != nDeRepeticiones) {
                System.out.print(i + ", ");
            }
            else {
                System.out.println(i);
            }

        }

        // Segunda secuencia
        int secuenciaWhile = 1;

        while (secuenciaWhile <= 100) {
            if (secuenciaWhile != 100) {
                System.out.print(secuenciaWhile + ", " + (100-secuenciaWhile)+ ", ");
            }
            else {
                System.out.println(secuenciaWhile + ", 0");
            }

            secuenciaWhile++;
        }

        //Tercera secuencia (Fibonacci)
        long a = 0, b = 1, c, contadorDeRepeticiones = 0;

        do {
            if (contadorDeRepeticiones != nDeRepeticiones-1) {
                System.out.print(a + ", ");
            }
            else {
                System.out.println(a);
            }

            c = a+b;
            a = b;
            b = c;

            contadorDeRepeticiones++;
        } while (contadorDeRepeticiones < nDeRepeticiones);
    }
}
