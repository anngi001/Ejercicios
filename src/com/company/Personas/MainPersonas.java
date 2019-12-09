package com.company.Personas;

import java.util.Scanner;

public class MainPersonas {

    public static void main(String[] args) throws Exception {

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
        MayorEdad(persona1);
        PesoAviso(persona1);


        System.out.println("----------------------Segunda Persona---------------------- \n");

        System.out.println(persona2.toString());
        MayorEdad(persona2);
        PesoAviso(persona2);


        System.out.println("----------------------Tercera Persona---------------------- \n");
        System.out.println(persona3.toString());
        MayorEdad(persona3);
        PesoAviso(persona3);


    }

    public static void PesoAviso(Persona persona) {
        int IMC = persona.calcularIMC();

        switch (IMC) {
            case Persona.dentro_peso:
                System.out.println("\t\t **********************************");
                System.out.println("\t\t*La persona esta en su peso ideal*");
                System.out.println("\t\t**********************************");
                break;
            case Persona.debajo_Peso:
                System.out.println("\t\t*********************************************");
                System.out.println("\t\t*La persona esta por debajo de su peso ideal*");
                System.out.println("\t\t*********************************************");
                break;
            case Persona.sobre_peso:
                System.out.println("\t\t*********************************************");
                System.out.println("\t\t*La persona esta por encima de su peso ideal*");
                System.out.println("\t\t*********************************************");
                break;
        }
    }

    public static void MayorEdad(Persona persona) {

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






