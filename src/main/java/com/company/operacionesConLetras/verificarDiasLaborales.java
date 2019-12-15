package com.company.operacionesConLetras;


import com.company.Main;
import com.company.obtener_valores.leer_variables;

import java.util.logging.Logger;

import static  com.company.obtener_valores.constantes.*;



public class verificarDiasLaborales {
    leer_variables leerVariables = new leer_variables();
    final Logger logger = Logger.getLogger(Main.class.getName());




    public void diaLaboral() {
        String dia = leerVariables.leerPalabra();
        dia = dia.toLowerCase();
        dia = dia.substring(0, 1).toUpperCase() + dia.substring(1);
        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                logger.info(DIALABORAL);
                break;
            case "Sabado":
            case "Domingo":
                logger.info("NO " + DIALABORAL);
                break;
            default:
                logger.info("NO " + DIALABORAL + "\n ****VERIFIQUE EL DIA**** \t");
        }
    }
}
