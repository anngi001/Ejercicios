package com.company.operacionesConLetras;

import com.company.Main;
import com.company.obtener_valores.leer_variables;

import java.util.logging.Logger;

public class reemplazarVocales {
    leer_variables leerVariables = new leer_variables();
    final Logger logger = Logger.getLogger(Main.class.getName());

    public void reemplazarTexto() {
        String texto = leerVariables.leerPalabra();
        texto = texto.replace("a", "e");
        String nuevo = "";
        nuevo = leerVariables.leerPalabra();
        nuevo = (texto.concat("\t" + nuevo));
      logger.info(nuevo);
    }
}
