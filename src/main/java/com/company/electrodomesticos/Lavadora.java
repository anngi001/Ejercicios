package com.company.electrodomesticos;

public class Lavadora extends Electrodomestico {


    private int carga;

    private final static int cargaDefault=5;




    public Lavadora(){
        this(precioBase, pesoBase, consumoDefault,colorBase, cargaDefault);
    }

    public Lavadora(double precioBase, double pesoBase){
        this(precioBase, pesoBase, consumoDefault, colorBase, cargaDefault);
    }

    public Lavadora(double precioBase, double pesoBase, char consumoEnergetico, String color, int cargaDefault) {
        //super() llamar al constructor de la clase padre.
        super(precioBase,pesoBase, consumoEnergetico,color);
        this.carga=carga;

    }

    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30) {
            precio = precioBase + 50 ;
        }
        return precio;
    }




    public int getCarga() {
        return carga;

    }




}
