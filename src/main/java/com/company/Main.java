package com.company;

import com.company.electrodomesticos.MainElectrodomesticos;
import com.company.numeros.*;
import com.company.obtener_valores.*;
import com.company.personas.MainPersonas;
import com.company.series.MainEntregable;

import static com.company.obtener_valores.constantes.*;


public class Main {
    public static void main(String[] args) throws Exception {
        comparar_numeros llamarComparar = new comparar_numeros();
        calcularAreaCirculo llamarAreaCirculo = new calcularAreaCirculo();
        calcularPrecioConIva llamarPrecioFinal = new calcularPrecioConIva();


        leer_variables leerVariables = new leer_variables();
        Procesos procesos = new Procesos();


        System.out.println("*******************   Que deseas conocer: ***************** \n" +
                "**** 1. Diferencia entre 2 numeros FIJOS " + "\t \t \t   ****\n" +
                "**** 2. Diferencia entre 2 numeros VARIANTES " + "\t \t   **** \n" +
                "**** 3. Area de un circulo" + "\t \t \t \t\t \t \t   **** \n" +
                "**** 4. Precios del producto final " + "\t \t \t \t\t   **** \n" +
                "**** 5. Par o Impar WHILE  " + "\t \t \t \t \t \t \t   **** \n" +
                "**** 6. Par o Impar FOR" + "\t \t \t \t\t \t \t  \t   **** \n" +
                "**** 7. Verifique si su numero es Mayor o Igual a CERO " + "****\n" +
                "**** 8. Dia Laboral" + "\t \t \t \t\t \t \t  \t \t   **** \n" +
                "**** 9. Reemplazar texto y Concatenar " + "\t \t \t \t   **** \n" +
                "**** 10. Eliminar Espacios de una frase " + "\t \t \t   **** \n" +
                "**** 11. Contar vocales de una frase" + "\t \t \t \t   **** \n" +
                "**** 12. Compare Palabras " + "\t \t \t \t  \t \t  \t   **** \n" +
                "**** 13. Consulte la Fecha " + "\t \t \t \t  \t \t  \t   **** \n" +
                "**** 14.Saltos de 2 en 2 " + "\t \t \t \t  \t \t  \t   **** \n" +
                "**** 15. Gestion Cinematografica" + "\t \t \t \t  \t   **** \n" +
                "**** 16. Informacion de Personas " + "\t \t \t \t  \t   **** \n" +
                "**** 17. Informacion de Electrodomesticos" + "\t \t \t   **** \n" +
                "**** 18. Informacion de Series" + "\t \t \t \t  \t \t   **** \n" +
                "**********************************************************");


        switch (leerVariables.leerNumero_Entero()) {
            case 1:
                llamarComparar.compararNumeros(VALOR1, VALOR2);
                break;
            case 2:
                llamarComparar.compararNumeros(leerVariables.leerNumero_Entero(), leerVariables.leerNumero_Entero());
                break;
            case 3:
                double enteroRadio = Double.parseDouble(leerVariables.leePalabra());
                llamarAreaCirculo.areaCirculo(enteroRadio);
                break;
            case 4:
                llamarPrecioFinal.precioFinal(Math.sqrt((double) leerVariables.leerNumero_Entero()));//******///
                break;
            case 5:
                procesos.parImparWHILE();
                break;
            case 6:
                procesos.parImparFOR();
                break;
            case 7:
                procesos.mayorIgual0();
                break;
            case 8:
                procesos.diaLaboral();
                break;
            case 9:
                procesos.reemplazarTexto();
                break;
            case 10:
                procesos.eliminarEspacios();
                break;
            case 11:
                procesos.contarFrase();
                break;
            case 12:
                procesos.compararPalabras();
                break;
            case 13:
                procesos.fecha();
                break;
            case 14:
                procesos.saltos2en2();
                break;
            case 15:
                procesos.gestinCine();
                break;
            case 16:
                MainPersonas.main(args);
                break;
            case 17:
                MainElectrodomesticos.main(args);
                break;
            case 18:
                MainEntregable.main(args);
                break;
            default:
                System.exit(0);

        }


    }


}




