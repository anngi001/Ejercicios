package com.company.electrodomesticos;

public class  Electrodomestico{
  private String color;
    private char consumoEnergetico;
    private double precio;
    private double peso;

    public final static String colorBase = "Blanco";
    public final static char consumoDefault = 'F';
    public static double precioBase = 100;
    public static double pesoBase = 5.0;


    public Electrodomestico() {
        this(consumoDefault, precioBase, pesoBase);

    }

    public Electrodomestico(char consumo, double precio, double peso) {
        this.consumoEnergetico = consumo;
        this.precio = precio;
        this.peso = peso;
    }


    public Electrodomestico(double precioBase, double pesoBase) {
        this(precioBase,pesoBase,consumoDefault,colorBase);
    }

    public Electrodomestico(double precioBase, double pesoBase, char consumoEnergetico, String colorBase) {
        this.precioBase = precioBase;
        this.pesoBase= pesoBase;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(colorBase);
    }




    private void comprobarColor(String color) {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = Electrodomestico.colorBase;
        }
    }


    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        if(consumoEnergetico>=0 && consumoEnergetico<=80){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=consumoDefault;
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

        return precioBase+precio;
    }


    public double getPrecio() {
        return precioBase;
    }

    public String getColor() {
        return colorBase;
    }


    public char getConsumoEnergetico() {
        return consumoDefault;
    }

    public double getPeso() {
        return pesoBase;
    }


}
