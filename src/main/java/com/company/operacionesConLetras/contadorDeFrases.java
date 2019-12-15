package com.company.operacionesConLetras;

import com.company.Main;
import com.company.obtener_valores.leer_variables;

import java.util.logging.Logger;

import static com.company.obtener_valores.constantes.*;

public class contadorDeFrases {
    leer_variables leerVariables = new leer_variables();
final Logger logger = Logger.getLogger(Main.class.getName());

    public void contarFrase() {
        String frase = leerVariables.leerPalabra();
        frase = frase.replace(" ", "");
        logger.info(frase + "Contiene " + frase.length() + " caracteres");
        logger.info(CONFIRMACIONFRASE + frase.split("a").length + " A");
        logger.info(CONFIRMACIONFRASE + frase.split("e").length + " E");
        logger.info(CONFIRMACIONFRASE + frase.split("i").length + " I");
        logger.info(CONFIRMACIONFRASE + frase.split("o").length + " O");
        logger.info(CONFIRMACIONFRASE + frase.split("u").length + " U");
    }
}
