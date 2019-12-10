package com.company.numeros;

public class calcularPrecioConIva {

    public void precioFinal(double precio) {
        double iva = 0.21;
        precio = (precio * iva) + precio;
        System.out.println("El precio final de su producto es \t " + precio);
    }
}
