package com.pronoob.basicos;

public class Casting {
    public static void main(String[] args) {
        // El casting nos permite extraer informacion de un tipo de dato a otro tipo de dato

        // Voy a crear un numero double
        double num = 43.9;

        // Con el casting podemos convertir este double en otros tipos de dato
        float numFloat = (float) num;
        int numInt = (int) num;
        char numChar = (char) num;
        short numShort = (short) num;
        long numLong = (long) num;
        byte numByte = (byte) num;

        // Imprimo el double
        System.out.println("double: " + num);

        // Imprimir todos los casts
        System.out.println("float: " + numFloat);
        System.out.println("float: " + numInt);
        System.out.println(numChar);
        System.out.println(numShort);
        System.out.println(numLong);
        System.out.println(numByte);
    }
}
