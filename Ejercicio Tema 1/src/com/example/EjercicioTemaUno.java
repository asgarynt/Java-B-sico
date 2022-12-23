package com.example;

public class EjercicioTemaUno {
    public static void main(String[] args) {
        System.out.println("Los datos son: ");

        // 1. Numéricos
        System.out.println("\n1. Numéricos");


        // 1.1 Enteros
        System.out.println("\t1.1 Enteros ");
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 100;
        System.out.println("\t\tbyte= " + variable1);
        System.out.println("\t\tshort= " + variable2);
        System.out.println("\t\tint= " + variable3);
        System.out.println("\t\tlong= " + variable4);

        // 1.2 decimales
        System.out.println("\t1.2 Decimales ");
        float variable5 = 5.5f;
        double variable6 = 10.5d;
        System.out.println("\t\tfloat= " + variable5);
        System.out.println("\t\tdouble= " + variable6);

        // 2 Booleano
        System.out.println("\n2 Booleano ");
        boolean variable7 = true;
        boolean variable8 = false;
        System.out.println("\t\tboolean(true)= " + variable7);
        System.out.println("\t\tboolean(false)= " + variable8);



        // 3 Texto
        System.out.println("\n3 Texto ");
        char variable9 = 'a';
        String variable10 = "Lorem ipsum dolor sit amet.....";
        System.out.println("\t\tchar= " + variable9);
        System.out.println("\t\tString= " + variable10);

    }

}
