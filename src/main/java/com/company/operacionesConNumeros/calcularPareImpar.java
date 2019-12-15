package com.company.operacionesConNumeros;

import com.company.Main;

import java.util.logging.Logger;

public class calcularPareImpar {
    final Logger logger = Logger.getLogger(Main.class.getName());
    public void parImparWHILE() {
        int valor = 1;
        while (valor <= 100) {
            valor = valor + 1;
            if (valor % 2 == 0) {
                logger.info("Par"+valor);

            } else
               logger.info("Impar \t" + valor);
        }
    }

    public void parImparFOR() {
        for (int valor = 1; valor <= 100; valor++) {
            if (valor % 2 == 0) {
             logger.info("Par \t " + valor);
            } else
                logger.info("Impar \t " + valor);
        }
    }
}
