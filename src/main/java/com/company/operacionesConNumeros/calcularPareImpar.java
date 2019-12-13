package com.company.operacionesConNumeros;

public class calcularPareImpar {
    public void parImparWHILE() {
        int valor = 1;
        while (valor <= 100) {
            valor = valor + 1;
            if (valor % 2 == 0) {
                System.out.println("Par \t " + valor);
            } else
                System.out.println("Impar \t" + valor);
        }
    }

    public void parImparFOR() {
        for (int valor = 1; valor <= 100; valor++) {
            if (valor % 2 == 0) {
                System.out.println("Par \t " + valor);
            } else
                System.out.println("Impar \t " + valor);
        }
    }
}
