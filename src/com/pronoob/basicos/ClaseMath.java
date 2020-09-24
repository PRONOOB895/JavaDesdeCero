package com.pronoob.basicos;

import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        /*
        La clase Math en Java es de las mas importantes en el lenguaje,
        con esta puedes hacer raices cuadradas, potencias o funciones
        trigonometricas.
        En este ejemplo vamos a hacer una minicalculadora.
         */

        final Scanner sc = new Scanner(System.in);
        int opcion;
        double a, b;

        /*
        Aqui vamos a empezar a hacer el menu de opciones
        para que el usuario eliga el tipo de operacion
        que quiere efectuar.
         */

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Potenciar");
        System.out.println("6. Sacar raiz cuadrada");
        System.out.print("Ingrese el numero de la opcion: ");
        opcion = sc.nextInt();

        /*
        Dependiendo de la opcion que el usuario digite,
        el condicional va a dar la operacion correcta
         */

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el numero a: ");
                a = sc.nextDouble();
                System.out.print("Ingrese el numero b: ");
                b = sc.nextDouble();
                System.out.print(a + b);
            }
            case 2 -> {
                System.out.print("Ingrese el numero a: ");
                a = sc.nextDouble();
                System.out.print("Ingrese el numero b: ");
                b = sc.nextDouble();
                System.out.print(a - b);
            }
            case 3 -> {
                System.out.print("Ingrese el numero a: ");
                a = sc.nextDouble();
                System.out.print("Ingrese el numero b: ");
                b = sc.nextDouble();
                System.out.print(a * b);
            }
            case 4 -> {
                System.out.print("Ingrese el numero a: ");
                a = sc.nextDouble();
                System.out.print("Ingrese el numero b: ");
                b = sc.nextDouble();
                System.out.print(a / b);
            }
            case 5 -> {
                System.out.print("Ingrese el numero a: ");
                a = sc.nextDouble();
                System.out.print("Ingrese el numero b: ");
                b = sc.nextDouble();
                System.out.print(Math.pow(a, b));
            }
            case 6 -> {
                System.out.print("Ingrese el numero a: ");
                a = sc.nextDouble();
                System.out.print(Math.sqrt(a));
            }
            default -> System.out.print("Esa opcion no es valida!");
        }

        sc.close();
    }
}
