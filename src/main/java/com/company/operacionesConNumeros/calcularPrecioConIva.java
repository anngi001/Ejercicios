package com.company.operacionesConNumeros;

import com.company.Main;

import java.util.logging.Logger;

public class calcularPrecioConIva {
    final Logger logger = Logger.getLogger(Main.class.getName());
    public void precioFinal(double precio) {
        double iva = 0.21;
        precio = (precio * iva) + precio;
        String msgPrecio = "El precio final de su producto es \t " +precio;

    }
}
