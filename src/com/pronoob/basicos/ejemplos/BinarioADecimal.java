package com.pronoob.basicos.ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class BinarioADecimal {
    // Si el String ingresado no es binario, la funcion no dara resultados correctos
    public static int binaryToDecimal(String binaryNumber) {
        int maxIndex = binaryNumber.length() - 1;
        int answer = 0;

        for (int i = 0; i < binaryNumber.length(); i++) {
            int binaryAtIndex = Integer.parseInt(String.valueOf(binaryNumber.charAt(i)));

            answer += Math.pow(2,maxIndex - i) * binaryAtIndex;
        }

        return answer;
    }

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Escribe un numero binario: ");
        String binaryNum = sc.nextLine();
        System.out.println(binaryToDecimal(binaryNum));
    }
}
