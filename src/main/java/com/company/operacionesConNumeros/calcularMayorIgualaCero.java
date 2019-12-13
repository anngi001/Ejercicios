package com.company.operacionesConNumeros;


import com.company.obtener_valores.*;

public class calcularMayorIgualaCero {
    leer_variables leerVariables = new leer_variables();

    public void mayorIgual0() {
        double valor;
        do {
            valor = leerVariables.leerNumero_Entero();
        } while (valor >= 0);
        System.out.println(+valor + "\t Es MENOR que 0");
    }
}



