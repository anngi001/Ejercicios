package com.company.operacionesConObjetos.actividades.Cine;

import com.company.Main;
import com.company.obtener_valores.leer_variables;

import java.util.logging.Logger;

public class accionesCinematografia {
    leer_variables leerVariables = new leer_variables();
    final Logger logger = Logger.getLogger(Main.class.getName());

    public void gestionCine() {
        String menu = (
                " \"****** GESTION CINEMATOGRÁFICA ******** \\n\" " +
                        "                \"1-NUEVO ACTOR \\n\" +\n" +
                        "                \"2-BUSCAR ACTOR \\n\" +\n" +
                        "                \"3-ELIMINAR ACTOR \\n\" +\n" +
                        "                \"4-MODIFICAR ACTOR \\n\" +\n" +
                        "                \"5-VER TODOS LOS ACTORES \\n\" +\n" +
                        "                \"6- VER PELICULAS DE LOS ACTORES \\n\" +\n" +
                        "                \"7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \\n\" +\n" +
                        "                \"8-SALIR \" ");
        int vueltas = 4;
        do {
            int opciones = leerVariables.leerNumero_Entero();
            System.out.println(menu);
            switch (opciones) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    String mensajeIncorrecto = "OPCION INCORRECATA ... ";
                    logger.info(mensajeIncorrecto);

                    gestionCine();
                    break;
            }
            while (opciones >= 8) ;
        } while (vueltas >= 4);
    }
}
