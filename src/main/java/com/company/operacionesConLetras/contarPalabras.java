package com.company.operacionesConLetras;

import com.company.Main;
import com.company.obtener_valores.leer_variables;

import java.util.logging.Logger;

public class contarPalabras {
    leer_variables leerVariables = new leer_variables();
    final Logger logger = Logger.getLogger(Main.class.getName());
    public void compararPalabras() {
        String palabra1 = leerVariables.leerPalabra();
        String palabra2 = leerVariables.leerPalabra();

        String[] cadena1 = palabra1.split(" ");
        String caracteres1 = cadena1[0];
        String[] cadena2 = palabra2.split(" ");
        String caracteres2 = cadena2[0];

        if (caracteres1.equals(caracteres2)) {
            logger.info("Son iguales");
        } else {
            logger.info("No son iguales");

            for (int i = 0; i <= caracteres1.length(); i++) {
                for (int j = 0; j <= caracteres2.length(); j++) {

                    logger.info("Segunda Palabra " + j + ": " + caracteres2.charAt(j));
                    logger.info("Primera Palabra " + i + ": " + caracteres1.charAt(i));

                    boolean comparar;
                    comparar = caracteres1.split("")[i].equals(caracteres2.split("")[j]);
                    if (comparar) {
                        logger.info("Las Letras Son iguales \n ");
                    } else
                        logger.info("*****Aqui esta la Diferencia***** \n");
                    i = i + 1;
                }

            }
        }
    }
}
