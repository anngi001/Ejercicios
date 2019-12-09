package com.company;

import com.company.Electrodomesticos.MainElectrodomesticos;
import com.company.Personas.MainPersonas;
import com.company.Personas.Persona;
import com.company.Electrodomesticos.Electrodomestico;




import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        boolean salir = true;
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) {



        });
        Procesos procesos = new Procesos();
        MainElectrodomesticos principalElectrodomesticos = new MainElectrodomesticos();
        MainPersonas principalPersonas = new MainPersonas();

        System.out.println("*******************   Que deseas conocer: ***************** \n" +
                "**** 1. Diferencia entre 2 numeros FIJOS "+ "\t \t \t   ****\n" +
                "**** 2. Diferencia entre 2 numeros VARIANTES "+"\t \t   **** \n" +
                "**** 3. Area de un circulo"+"\t \t \t \t\t \t \t   **** \n" +
                "**** 4. Precios del producto final "+"\t \t \t \t\t   **** \n" +
                "**** 5. Par o Impar WHILE  "+"\t \t \t \t \t \t \t   **** \n" +
                "**** 6. Par o Impar FOR"+"\t \t \t \t\t \t \t  \t   **** \n" +
                "**** 7. Verifique si su numero es Mayor o Igual a CERO "+ "****\n" +
                "**** 8. Dia Laboral"+"\t \t \t \t\t \t \t  \t \t   **** \n" +
                "**** 9. Reemplazar texto y Concatenar "+"\t \t \t \t   **** \n" +
                "**** 10. Eliminar Espacios de una frase "+"\t \t \t   **** \n" +
                "**** 11. Contar vocales de una frase"+"\t \t \t \t   **** \n" +
                "**** 12. Compare Palabras "+"\t \t \t \t  \t \t  \t   **** \n" +
                "**** 13. Consulte la Fecha "+"\t \t \t \t  \t \t  \t   **** \n" +
                "**** 14.Saltos de 2 en 2 "+"\t \t \t \t  \t \t  \t   **** \n" +
                "**** 15. Gestion Cinematografica"+"\t \t \t \t  \t   **** \n" +
                "**** 16. Informacion de Personas "+"\t \t \t \t  \t   **** \n" +
                "**** 17. Informacion de Electrodomesticos"+"\t \t \t   **** \n" +
                "**** 18. Informacion de Series"+"\t \t \t \t  \t \t   **** \n" +
                "**********************************************************" +
                        "" +
                        "              *"
                );


            System.out.println("------INGRESE UNA OPCION------");
            int opciones = sc.nextInt();


            switch (opciones) {


                case 1:
                    int x = 8;
                    int y = 9;
                    procesos.compararNumeros(x, y);
                    break;
                case 2:
                    System.out.println("//// Ingrese su primer valor //// ");
                    int valor1 = sc.nextInt();
                    System.out.println("//// Ingrese su segundo valor//// ");
                    int valor2 = sc.nextInt();
                    procesos.compararNumeros(valor1, valor2);
                    break;
                case 3:
                    System.out.print(" Ingrese el valor del radio \n ");
                    String CadenaRadio = reader.readLine();
                    double EnteroRadio = Double.parseDouble(CadenaRadio);
                    procesos.areaCirculo(EnteroRadio);
                    break;
                case 4:
                    System.out.println("Precio del producto");
                    double productoAct = sc.nextDouble();
                    procesos.precioFinal(productoAct);
                    break;
                case 5:
                    procesos.par_imparWHILE();
                    break;
                case 6:
                    procesos.par_imparFOR();
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
                    procesos.EliminarEspacios();
                    break;
                case 11:
                    procesos.contarFrase();
                    break;
                case 12:
                    procesos.compararPalabras();
                    break;
                case 13:
                    procesos.Fecha();
                    break;
                case 14:
                    procesos.saltos_2en2();
                    break;
                case 15:
                    procesos.gestinCine();
                    break;
                case 16:
                    principalPersonas.main(args);
                    break;
                case 17:
                    principalElectrodomesticos.main(args);
                    break;
                case 18:
                    break;







            }


    }



}




