package com.company.operacionesConLetras;

import java.text.SimpleDateFormat;
import java.util.Date;

public class obtenerFecha {

    public void fecha() {
        Date fecha = new Date();
        String formato = "(yyyy/MM/dd) hh: mm: ss ";
        SimpleDateFormat fechaFormato = new SimpleDateFormat(formato);
        System.out.println(fechaFormato.format(fecha));
    }
}
