package com.company.electrodomesticos;

public class  Electrodomestico{

    private char consumoEnergetico;
    private double peso;
    private String color;

    public static String COLOR_BASE = "Blanco";
    public static final char CONSUMO_DEFAULT = 'F';
    static double preciodefault = 100.0;
    static double pesobase = 5.0;


    public Electrodomestico() {
        this(CONSUMO_DEFAULT, preciodefault, pesobase);

    }


    public Electrodomestico(char consumo, double precio, double peso) {
        this.consumoEnergetico = consumo;
        this.peso = peso;
        this.preciodefault= precio;
    }


    public Electrodomestico(double precioDefault, double pesoBase) {
        this(precioDefault, pesoBase, CONSUMO_DEFAULT, COLOR_BASE);
    }

    public Electrodomestico(double precioDefault, double pesoBase, char consumoEnergetico, String colorBase) {
        preciodefault = precioDefault;
        pesobase = pesoBase;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(colorBase);
    }




    private void comprobarColor(String color) {
        String []colores = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }if (encontrado) {
            this.color = color;
        } else {
            this.color = Electrodomestico.COLOR_BASE;
        }
    }


    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        if(consumoEnergetico>=0 && consumoEnergetico<=80){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico= CONSUMO_DEFAULT;
        }

    }

    public double precioFinal(){
        double precio=0;
        switch(consumoEnergetico){
            case 'A':
                precio =100;
                break;
            case 'B':
                precio =80;
                break;
            case 'C':
                precio =60;
                break;
            case 'D':
                precio =50;
                break;
            case 'E':
                precio =30;
                break;
            case 'F':
                precio+=10;
                break;
            default:
                System.out.println(" Letra no encontrado... Verifiquela");
                break;

        }

        if(peso>=0 && peso<19){
            precio=10;
        }else if(peso>=20 && peso<49){
            precio+=50;
        }else if(peso>=50 && peso<=79){
            precio+=80;
        }else if(peso>=80){
            precio+=100;
        }

        return preciodefault +precio;
    }


    public double getPrecio() {
        return preciodefault;
    }

    public String getColor() {
        return COLOR_BASE;
    }




    }



