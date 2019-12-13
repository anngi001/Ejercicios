package com.company.operacionesConNumeros;

import com.company.obtener_valores.leer_variables;

public class contadordeDosEnDos {
    leer_variables leerVariables = new leer_variables();

    public void saltos2en2() {
        int inicio = leerVariables.leerNumero_Entero();
        for (int i = inicio; i <= 1000; i += 2) {
            System.out.println("Valor siguiente \n " + i);
        }
    }
}
