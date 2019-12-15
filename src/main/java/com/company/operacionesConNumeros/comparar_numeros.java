package com.company.operacionesConNumeros;

import com.company.Main;

import java.util.logging.Logger;

public class comparar_numeros {

    final Logger logger = Logger.getLogger(Main.class.getName());

    public void compararNumeros(int x, int y) {
        String msgIgual = " Son iguales" ;
        String msgMayor = " es mayor que ";
        String msgMenor = " es mayor que " ;
        if (x == y) {
            logger.info(msgIgual);
        } else if (x > y) {
            logger.info(+x+ msgMayor +y);

        } else {
            logger.info(+y+ msgMenor +x);

        }
    }

}
