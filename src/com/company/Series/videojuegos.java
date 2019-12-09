package com.company.Series;

public class videojuegos implements Entregable_Interface {


    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;


    private final static int HORASDEFAULT = 100;
    public final static int MAYOR = 1;
    public final static int MENOR = -1;
    public final static int IGUAL = 0;

    public videojuegos() {
        this("", HORASDEFAULT, "", "");
    }


    public videojuegos(String titulo, int horasEstimadas) {
        this(titulo, HORASDEFAULT, "J", " ");
    }


    public videojuegos(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
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

    public String getcompañia() {
        return compañia;
    }

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }


    @Override
    public int compareTo(Object a) {
        int estado = MENOR;

        videojuegos ref = (videojuegos) a;
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
                "** compañia: " + compañia + "\t\t\t\t ** \n" +
                "*******************************";
    }


    public boolean equals(videojuegos a) {
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())) {
            return true;
        }
        return false;
    }

}

