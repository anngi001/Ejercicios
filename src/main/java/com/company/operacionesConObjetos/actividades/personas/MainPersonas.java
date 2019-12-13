package com.company.operacionesConObjetos.actividades.personas;

import com.company.obtener_valores.constantes;

import java.util.Scanner;


public class MainPersonas {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);


        System.out.println("***Escriba su nombre***");
        String nombre = sc.nextLine();

        System.out.println("***Escriba su edad***");
        int edad = sc.nextInt();

        System.out.print("***Escriba su sexo***\n");
        char sexo = sc.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        System.out.println("***Escriba su peso***");
        double peso = sc.nextDouble();

        System.out.println("***Escriba su altura***");
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


        System.out.println("----------------------Primera Persona---------------------- \n ");
        System.out.println(persona1.toString());
        mayorEdad(persona1);
        pesoAviso(persona1);


        System.out.println("----------------------Segunda Persona---------------------- \n");

        System.out.println(persona2.toString());
        mayorEdad(persona2);
        pesoAviso(persona2);


        System.out.println("----------------------Tercera Persona---------------------- \n");
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






