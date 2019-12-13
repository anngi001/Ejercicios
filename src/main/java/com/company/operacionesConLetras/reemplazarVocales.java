package com.company.operacionesConLetras;

import com.company.obtener_valores.leer_variables;

public class reemplazarVocales {
    leer_variables leerVariables = new leer_variables();

    public void reemplazarTexto() {
        String texto = leerVariables.leerPalabra();
        texto = texto.replace("a", "e");
        String nuevo = "";
        nuevo = leerVariables.leerPalabra();
        nuevo = (texto.concat("\t" + nuevo));
        System.out.println(nuevo);
    }
}
