package com.company.operacionesConLetras;


import com.company.obtener_valores.leer_variables;

import static  com.company.obtener_valores.constantes.*;



public class verificarDiasLaborales {
    leer_variables leerVariables = new leer_variables();




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
                System.out.println(DIALABORAL);
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("NO " + DIALABORAL);
                break;
            default:
                System.out.println("NO " + DIALABORAL + "\n ****VERIFIQUE EL DIA**** \t");
        }
    }
}
