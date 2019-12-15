package com.company.operacionesConNumeros;


import com.company.Main;
import com.company.obtener_valores.*;

import java.util.logging.Logger;

public class calcularMayorIgualaCero {
    leer_variables leerVariables = new leer_variables();
    final Logger logger = Logger.getLogger(Main.class.getName());

    public void mayorIgual0() {
        double valor;
        do {
            valor = leerVariables.leerNumero_Entero();
        } while (valor >= 0);
        logger.info(+valor + "\t Es MENOR que 0");
    }
}



