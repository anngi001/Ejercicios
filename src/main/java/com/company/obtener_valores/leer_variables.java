package com.company.obtener_valores;
import java.util.Scanner;
import java.util.logging.Logger;

public class leer_variables {
    static final Logger logger = Logger.getLogger(leer_variables.class.getName());
    Scanner sc = new Scanner(System.in);

    String mensajeEntero ="Ingrese el valor";
    public int leerNumero_Entero(){
        logger.info(mensajeEntero);
        int valor  = sc.nextInt();
        return valor;
    }

    public String leerPalabra(){

        logger.info("Ingrese la palabra");
        String letra = sc.nextLine();
        return letra;
    }

}
