package com.company.Personas;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    private String DNI;


    public final static char sexoDefault = 'H';
    public final static int debajo_Peso = 0;
    public final static int sobre_peso = 1;
    public final static int dentro_peso = -1;


    public Persona() {
        generarDni();
        comprobarSexo();
    }



    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexoDefault, 0, 0);
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
            return debajo_Peso;
        } else if (pesoActual < 20) {
            return dentro_peso;
        } else {
            return sobre_peso;
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
            this.sexo = sexoDefault;
        }
    }


    public String toString() {
        String sexo = " ";
        if (this.sexo == 'H') {
            sexo = "Hombre";
        } else if (this.sexo == 'M') {
            sexo = "Mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }


    public void generarDni() {
        final int divisor = 23;

        int dniNUMERO = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int resta = dniNUMERO - (dniNUMERO / divisor * divisor);

        char dniLETRA = generaLetraDNI(resta);

        DNI = Integer.toString(dniNUMERO) + dniLETRA;

    }

    public char generaLetraDNI(int resta) {
        char generarLetras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
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






