package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.util.logging.Logger;

import static com.company.obtener_valores.constantes.*;

public class Main {
    public static void main(String[] args) {
        final Logger logger = Logger.getLogger(Main.class.getName());
        llamadas_de_clases llamada =new llamadas_de_clases();

do {

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


    switch (llamada.leer_Variables.leerNumero_Entero()) {
        case 1:
            llamada.llamar_Comparar.compararNumeros(VALOR1, VALOR2);
            break;
        case 2:
            llamada.llamar_Comparar.compararNumeros(llamada.leer_Variables.leerNumero_Entero(), llamada.leer_Variables.leerNumero_Entero());
            break;
        case 3:
            double enteroRadio = Double.parseDouble(llamada.leer_Variables.leerPalabra());
            llamada.llamar_AreaCirculo.areaCirculo(enteroRadio);
            break;
        case 4:
            llamada.llamar_PrecioFinal.precioFinal(Math.sqrt((double) llamada.leer_Variables.leerNumero_Entero()));
        case 5:
            llamada.llamar_CalcularPareImpar.parImparWHILE();
            break;
        case 6:
            llamada.llamar_CalcularPareImpar.parImparFOR();
            break;
        case 7:
            llamada.llamar_CalcularMayorIgualaCero.mayorIgual0();
            break;
        case 8:
            llamada.llamar_Dias.diaLaboral();
            break;
        case 9:
            llamada.llamar_ReemplazarVocales.reemplazarTexto();
            break;
        case 10:
            llamada.llamar_EliminarEspacios.eliminarEspacios();
            break;
        case 11:
            llamada.llamar_ContadorDeFrases.contarFrase();
            break;
        case 12:
            llamada.llamar_ContarPalabras.compararPalabras();
            break;
        case 13:
            llamada.llamar_ObtenerFecha.fecha();
            break;
        case 14:
            llamada.llamar_ContadordeDosEnDos.saltos2en2();
            break;
        case 15:
            llamada.llamar_Cinematografia.gestionCine();
            break;
        case 16:
            llamada.llamar_Personas.main(args);
        case 17:
            llamada.llamar_Electrodomesticos.main(args);
            break;
        case 18:
            llamada.llamar_SeriesEntregable.main(args);
            break;
        default:
            System.exit(0);


    }
    System.out.println("Desea volver a tomar una opcion?\n" +
            "1.SI \n" +
            "2.NO \n");
    int opcionVuelta =llamada.leer_Variables.leerNumero_Entero();
    if (opcionVuelta == 1){
        main(args);
    }else
        System.exit(0);

}while (REPETIR == 1);
    }


}




