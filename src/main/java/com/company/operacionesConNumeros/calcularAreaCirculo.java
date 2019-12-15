package com.company.operacionesConNumeros;

import com.company.Main;

import java.util.logging.Logger;

public class calcularAreaCirculo {
    final Logger logger = Logger.getLogger(Main.class.getName());
    public void areaCirculo(double radio) {

        radio = Math.PI * Math.pow(radio, 2);
        logger.info("El area del circulo es \t " + radio);
    }
}
