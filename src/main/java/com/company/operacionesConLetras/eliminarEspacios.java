package com.company.operacionesConLetras;

import com.company.obtener_valores.leer_variables;

public class eliminarEspacios {
    leer_variables leerVariables = new leer_variables();
    public void eliminarEspacios() {
        String frase = leerVariables.leerPalabra();
        frase = frase.replace(" ", "");
        System.out.println(frase);
    }
}
