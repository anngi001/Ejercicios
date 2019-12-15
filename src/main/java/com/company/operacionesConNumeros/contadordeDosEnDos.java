package com.company.operacionesConNumeros;

import com.company.Main;
import com.company.obtener_valores.leer_variables;

import java.util.logging.Logger;

public class contadordeDosEnDos {

    leer_variables leerVariables = new leer_variables();
    final Logger logger = Logger.getLogger(Main.class.getName());

    public void saltos2en2() {
        int inicio = leerVariables.leerNumero_Entero();
        for (int i = inicio; i <= 1000; i += 2) {
            String valorSg = "Valor siguiente ";
            logger.info(valorSg.concat(String.valueOf(i)));

        }
    }
}
