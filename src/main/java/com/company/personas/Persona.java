package com.company.personas;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String dni;

    public static int DEBAJOPESO = 0;
    public static int SOBREPESO = 1;
    public static int DENTROPESO = -1;
    public static char SEXODEFAULT = 'H';


    public Persona() {
        generarDni();
        comprobarSexo();
    }



    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, SEXODEFAULT, 0, 0);
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generarDni();
        comprobarSexo();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }


    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));

        if (pesoActual >= 20 && pesoActual <= 25) {
            return DEBAJOPESO;
        } else if (pesoActual < 20) {
            return DENTROPESO;
        } else {
            return SOBREPESO;
        }
    }


    public boolean mayorEdad() {
        boolean mayor = false;
        //constante mayor edad (Diferente paises)
        if ((edad >= 18)) {
            mayor = true;
        }
        return mayor;
    }
    private void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXODEFAULT;
        }
    }


    public String toString() {
        String comprobarsexo = " ";
        if (this.sexo == 'H') {
            comprobarsexo = "Hombre";
        } else if (this.sexo == 'M') {
            comprobarsexo = "Mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + comprobarsexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }


    public void generarDni() {
        final int divisor = 23;
        Random r = new Random();
        int    dniNumero = r.nextInt((int) (Math.floor(Math.random()*100000000 - 10000000) + 10000000));
        int resta = dniNumero - (dniNumero / divisor * divisor);
        char dniLETRA = generaLetraDNI(resta);
        dni = Integer.toString(dniNumero) + dniLETRA;
    }

    public char generaLetraDNI(int resta) {
        char [] generarLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return generarLetras[resta];
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}






