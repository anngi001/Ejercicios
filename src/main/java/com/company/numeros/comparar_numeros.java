package com.company.numeros;

public class comparar_numeros {



    public void compararNumeros(int x, int y) {
        if (x == y) {
            System.out.println("Son iguales");
        } else if (x > y) {
            System.out.println(+x + " es mayor que " + y);
        } else {
            System.out.println(+y + " es mayor que " + x);
        }
    }

}
