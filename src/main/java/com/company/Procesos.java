package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Procesos {
    private static String DIALABORAL = "Es un dia laboral";
    private static String CONFIRMACIONFRASE = "la frase tiene: ";
    Scanner sc = new Scanner(System.in);
    public void compararNumeros(int x, int y) {
        if (x == y) {
            System.out.println("Son iguales");
        } else if (x > y) {
            System.out.println(+x + " es mayor que " + y);
        } else {
            System.out.println(+y + " es mayor que " + x);
        }
    }
    public void areaCirculo(double radio) {
        radio = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es \t " + radio);
    }

    public void precioFinal(double precio) {
        double iva = 0.21;
        precio = (precio * iva) + precio;
        System.out.println("El precio final de su producto es \t " + precio);
    }
    public void parImparWHILE() {
        int valor = 1;
        while (valor <= 100) {
            valor = valor + 1;
            if (valor % 2 == 0) {
                System.out.println("Par \t " + valor);
            } else
                System.out.println("Impar \t" + valor);
        }
    }
    public void parImparFOR() {
        for (int valor = 1; valor <= 100; valor++) {
            if (valor % 2 == 0) {
                System.out.println("Par \t " + valor);
            } else
                System.out.println("Impar \t " + valor);
        }
    }
    public void mayorIgual0() {
        double valor;
        do {
            System.out.println(" Ingresa un numero");
            valor = sc.nextDouble();
        } while (valor >= 0.0);
        System.out.println(+valor + "\t Es MENOR que 0");
    }
    public void diaLaboral() {
        System.out.println(" Ingresa un dia");
        String dia = sc.next();
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
    public void reemplazarTexto() {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        texto = texto.replace("a", "e");
        String nuevo = "";
        System.out.println("Agrega una linea la frase ");
        nuevo = sc.nextLine();
        nuevo = (texto.concat("\t" + nuevo));
        System.out.println(nuevo);
    }
    public void eliminarEspacios() {
        System.out.println("Ingrese una Frase");
        String frase = sc.nextLine();
        frase = frase.replace(" ", "");
        System.out.println(frase);
    }
    public void contarFrase() {
        System.out.println("Ingrese una Frase");
        String frase = sc.nextLine();
        frase = frase.replace(" ", "");
        System.out.println(frase + "Contiene " + frase.length() + " caracteres");
        System.out.println(CONFIRMACIONFRASE + frase.split("a").length + " A");
        System.out.println(CONFIRMACIONFRASE + frase.split("e").length + " E");
        System.out.println(CONFIRMACIONFRASE + frase.split("i").length + " I");
        System.out.println(CONFIRMACIONFRASE + frase.split("o").length + " O");
        System.out.println(CONFIRMACIONFRASE + frase.split("u").length + " U");
    }
    public void compararPalabras() {
        System.out.println("Ingrese una Palabra");
        String palabra1 = sc.nextLine();
        System.out.println("Ingrese otra palabra");
        String palabra2 = sc.nextLine();

        String[] cadena1 = palabra1.split(" ");
        String caracteres1 = cadena1[0];
        String[] cadena2 = palabra2.split(" ");
        String caracteres2 = cadena2[0];

        if (caracteres1.equals(caracteres2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");

            for (int i = 0; i <= caracteres1.length(); i++) {
                for (int j = 0; j <= caracteres2.length(); j++) {

                    System.out.println("Segunda Palabra " + j + ": " + caracteres2.charAt(j));
                    System.out.println("Primera Palabra " + i + ": " + caracteres1.charAt(i));

                    boolean comparar;
                    comparar = caracteres1.split("")[i].equals(caracteres2.split("")[j]);
                    if (comparar) {
                        System.out.println("Las Letras Son iguales \n ");
                    } else
                        System.out.println("*****Aqui esta la Diferencia***** \n");
                    i = i + 1;
                }

            }
        }
    }
    public void fecha() {
        Date fecha = new Date();
        String formato = "(yyyy/MM/dd) hh: mm: ss ";
        SimpleDateFormat fechaFormato = new SimpleDateFormat(formato);
        System.out.println(fechaFormato.format(fecha));
    }
    public void saltos2en2() {
        int inicio = sc.nextInt();
        for (int i = inicio; i <= 1000; i += 2) {
            System.out.println("Valor siguiente \n " + i);
        }
    }
    public void gestinCine() {
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
            System.out.println("Digite una opcion");
            int opciones = sc.nextInt();
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
                    System.out.println("OPCION INCORRECATA ... ");
                    gestinCine();
                    break;
            }
            while (opciones >= 8) ;
        } while (vueltas >= 4);
    }
}