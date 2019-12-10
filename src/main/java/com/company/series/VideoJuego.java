package com.company.series;

public class VideoJuego implements Entregable_Interface {


    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;


    private  static  int HORASDEFAULT = 100;
    public final  int MAYOR = 1;
    public final  int MENOR = -1;
    public final  int IGUAL = 0;

    public VideoJuego() {
        this("", HORASDEFAULT, "", "");
    }


    public VideoJuego(String titulo, int horasEstimadas) {
        this(titulo, HORASDEFAULT, "J", " ");
    }


    public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
        this.entregado = false;
    }


    @Override
    public void entregar() {
        entregado = true;

    }

    @Override
    public void devolver() {
        entregado = false;

    }

    @Override
    public boolean isEstregado() {
        if (entregado) {
            return true;
        }
        return false;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcompania() {
        return compania;
    }

    public void setcompañia(String compania) {
        this.compania = compania;
    }


    @Override
    public int compareTo(Object a) {
        int estado = MENOR;
        VideoJuego ref = (VideoJuego) a;
        if (horasEstimadas > ref.getHorasEstimadas()) {
            estado = MAYOR;
        } else if (horasEstimadas == ref.getHorasEstimadas()) {
            estado = IGUAL;
        }

        return estado;
    }


    @Override
    public String toString() {
        return "***********VIDEO-JUEGOS********" + "\n" +
                "** Titulo: " + titulo + "\t ** \n" +
                "** Horas estimadas: " + horasEstimadas + "\t\t **\n" +
                "** Genero: " + genero + "\t \t\t \t ** \n" +
                "** compañia: " + compania + "\t\t\t\t ** \n" +
                "*******************************";
    }


    public boolean equals(VideoJuego a) {
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getcompania())) {
            return true;
        }
        return false;
    }

}

