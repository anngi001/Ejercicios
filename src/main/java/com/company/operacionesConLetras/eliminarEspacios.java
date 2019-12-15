package com.company.operacionesConLetras;

import com.company.Main;
import com.company.obtener_valores.leer_variables;

import java.util.logging.Logger;

public class eliminarEspacios {
    final Logger logger = Logger.getLogger(Main.class.getName());
    leer_variables leerVariables = new leer_variables();
    public void eliminarEspacios() {
        String frase = leerVariables.leerPalabra();
        frase = frase.replace(" ", "");
        logger.info(frase);
    }
}
