package com.company.operacionesConObjetos.actividades.personas;

import com.company.Main;
import com.company.obtener_valores.constantes;

import java.util.Scanner;
import java.util.logging.Logger;


public class MainPersonas {

    public static void main(String[] args)  {
        final Logger logger = Logger.getLogger(Main.class.getName());
        Scanner sc = new Scanner(System.in);


        String mensaje ="Escriba su ";
        String mensajePersonas ="Persona n° ";


        logger.info(mensaje.concat("nombre"));
        String nombre = sc.nextLine();


        logger.info(mensaje.concat("edad"));
        int edad = sc.nextInt();

        logger.info(mensaje.concat("sexo"));
        char sexo = sc.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        logger.info(mensaje.concat("peso"));
        double peso = sc.nextDouble();

        logger.info(mensaje.concat("altura"));
        double altura = sc.nextDouble();


        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        persona1.setNombre("Anngi");
        persona1.setEdad(21);
        persona1.setSexo('M');
        persona1.setPeso(58.0);
        persona1.setAltura(1.53);

        persona2.setPeso(54.3);
        persona2.setAltura(156.0);



        logger.info(mensajePersonas.concat("1"));
        System.out.println(persona1.toString());
        mayorEdad(persona1);
        pesoAviso(persona1);



        logger.info(mensajePersonas.concat("2"));
        System.out.println(persona2.toString());
        mayorEdad(persona2);
        pesoAviso(persona2);



        logger.info(mensajePersonas.concat("3"));
        System.out.println(persona3.toString());
        mayorEdad(persona3);
        pesoAviso(persona3);


    }

    public static void pesoAviso(Persona persona) {
        int indiceMCorporal = persona.calcularIMC();

        switch (indiceMCorporal) {
            case constantes.DENTRO_PESO:
                System.out.println("\t\t **********************************");
                System.out.println("\t\t*La persona esta en su peso ideal*");
                System.out.println("\t\t**********************************");
                break;
            case constantes.DEBAJO_PESO:
                System.out.println("\t\t*********************************************");
                System.out.println("\t\t*La persona esta por debajo de su peso ideal*");
                System.out.println("\t\t*********************************************");
                break;
            case constantes.SOBRE_PESO:
                System.out.println("\t\t*********************************************");
                System.out.println("\t\t*La persona esta por encima de su peso ideal*");
                System.out.println("\t\t*********************************************");
                break;
        }
    }

    public static void mayorEdad(Persona persona) {

        if (persona.mayorEdad()) {
            System.out.println("\t\t*****************************");
            System.out.println("\t\t*La persona es mayor de edad*");
            System.out.println("\t\t*****************************");
        } else {
            System.out.println("\t\t********************************");
            System.out.println("\t\t*La persona no es mayor de edad*");
            System.out.println("\t\t********************************");
        }
    }


}






