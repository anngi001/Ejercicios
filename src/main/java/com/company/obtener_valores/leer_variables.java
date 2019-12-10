package com.company.obtener_valores;
import java.util.Scanner;

public class leer_variables {
    Scanner sc = new Scanner(System.in);

    public int leerNumero_Entero(){
        System.out.println("Ingrese el valor");
        int valor  = sc.nextInt();
        return valor;
    }

    public String leePalabra(){
        System.out.println("Ingrese lo que se necesita");
        String letra = sc.nextLine();
        return letra;
    }
    public double leerNumero_Decimales(){
        System.out.println("Ingrese el valor");
        double valor  = sc.nextDouble();
        return valor;
    }
}
