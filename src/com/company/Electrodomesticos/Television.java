package com.company.Electrodomesticos;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;


    private final static int resolucionDefault = 20;
    private final static boolean sintonizadorTDTDefault = false;


    public Television() {

    }



    public Television(char consumo, double precio, double peso, int resolucion, boolean sintonizadorTDT) {
        super(consumo, precio, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }



    public Television(double precioBase, double pesoBase, char consumoDefault, String colorBase, int resolucionDefault, boolean sintonizadorTDTDefault) {
        super(precioBase,
                pesoBase,
                consumoDefault,
                colorBase
        );
        this.resolucion = resolucionDefault;
        this.sintonizadorTDT = sintonizadorTDTDefault;
    }



    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) {
            precio = precioBase * 0.3;
        }
        if (sintonizadorTDT) {
            precio = precioBase + 50;
        }

        return precio;
    }
}




