package com.company.operacionesConNumeros;

public class calcularAreaCirculo {
    public void areaCirculo(double radio) {
        radio = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es \t " + radio);
    }
}
