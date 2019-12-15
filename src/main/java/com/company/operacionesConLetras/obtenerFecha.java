package com.company.operacionesConLetras;

import com.company.Main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class obtenerFecha {
    final Logger logger = Logger.getLogger(Main.class.getName());
    public void fecha() {
        Date fecha = new Date();
        String formato = "(yyyy/MM/dd) hh: mm: ss ";
        SimpleDateFormat fechaFormato = new SimpleDateFormat(formato);
        logger.info(fechaFormato.format(fecha));
    }
}
