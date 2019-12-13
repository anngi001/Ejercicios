package com.company.operacionesConLetras;

import com.company.obtener_valores.leer_variables;
import static com.company.obtener_valores.constantes.*;

public class contadorDeFrases {
    leer_variables leerVariables = new leer_variables();


    public void contarFrase() {
        String frase = leerVariables.leerPalabra();
        frase = frase.replace(" ", "");
        System.out.println(frase + "Contiene " + frase.length() + " caracteres");
        System.out.println(CONFIRMACIONFRASE + frase.split("a").length + " A");
        System.out.println(CONFIRMACIONFRASE + frase.split("e").length + " E");
        System.out.println(CONFIRMACIONFRASE + frase.split("i").length + " I");
        System.out.println(CONFIRMACIONFRASE + frase.split("o").length + " O");
        System.out.println(CONFIRMACIONFRASE + frase.split("u").length + " U");
    }
}
