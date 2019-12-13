package com.company.operacionesConObjetos.actividades.electrodomesticos;

import static com.company.obtener_valores.constantes.*;

public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;




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
            precio =  preciodefault * 0.3;
        }
        if (sintonizadorTDT) {
            precio = preciodefault + 50;
        }
        return precio;
    }
}




