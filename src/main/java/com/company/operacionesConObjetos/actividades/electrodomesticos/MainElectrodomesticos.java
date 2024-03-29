package com.company.operacionesConObjetos.actividades.electrodomesticos;

import com.company.Main;

import java.util.logging.Logger;

public class MainElectrodomesticos {
    public static void main(String[] args)  {
        final Logger logger = Logger.getLogger(Main.class.getName());
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];


        listaElectrodomesticos[0]=new Electrodomestico(500.000, 90, 'A', "Azul");
        listaElectrodomesticos[1]=new Lavadora(900.000,34,'A',"Blanco",30);
        listaElectrodomesticos[2]=new Television(500.000, 80, 'E', "negro", 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600.000, 40, 'D', "gris");
        listaElectrodomesticos[5]=new Lavadora(780.000, 40, 'Z', "blanco", 40);

        listaElectrodomesticos[7]=new Lavadora(900.000, 100, 'A', "verde", 15);
        listaElectrodomesticos[8]=new Television(700.00, 60, 'C', "naranja", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(566.000, 10);



        double totalElectrodomesticos=0;
        double totalTelevisiones=0;
        double totalLavadoras=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){

            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                totalElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                totalLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                totalTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        String mensajeElectodomesticos = "Sus electrodomestricos son:";
        logger.info(mensajeElectodomesticos.concat(String.valueOf(totalElectrodomesticos)));
        String mensajesLavadoras = "Sus Lavadoras son: " ;
        logger.info(mensajesLavadoras.concat(String.valueOf(totalLavadoras)));
        String mensajesTelevisores = "Sus Televisores son: ";
        logger.info(mensajesTelevisores.concat(String.valueOf(totalTelevisiones)));

    }
}
