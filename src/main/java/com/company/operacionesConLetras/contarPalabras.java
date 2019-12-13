package com.company.operacionesConLetras;

import com.company.obtener_valores.leer_variables;

public class contarPalabras {
    leer_variables leerVariables = new leer_variables();
    public void compararPalabras() {
        String palabra1 = leerVariables.leerPalabra();
        String palabra2 = leerVariables.leerPalabra();

        String[] cadena1 = palabra1.split(" ");
        String caracteres1 = cadena1[0];
        String[] cadena2 = palabra2.split(" ");
        String caracteres2 = cadena2[0];

        if (caracteres1.equals(caracteres2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");

            for (int i = 0; i <= caracteres1.length(); i++) {
                for (int j = 0; j <= caracteres2.length(); j++) {

                    System.out.println("Segunda Palabra " + j + ": " + caracteres2.charAt(j));
                    System.out.println("Primera Palabra " + i + ": " + caracteres1.charAt(i));

                    boolean comparar;
                    comparar = caracteres1.split("")[i].equals(caracteres2.split("")[j]);
                    if (comparar) {
                        System.out.println("Las Letras Son iguales \n ");
                    } else
                        System.out.println("*****Aqui esta la Diferencia***** \n");
                    i = i + 1;
                }

            }
        }
    }
}
