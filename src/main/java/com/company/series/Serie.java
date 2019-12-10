package com.company.series;

public class Serie implements Entregable_Interface {

    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public static final int NUMERO_TEMPORADAS_DEFAULT = 3;


    public static final  int MAYOR = 1;
    public static final  int IGUAL = 0;
    public static final  int MENOR = -1;


    public Serie() {
        this("", NUMERO_TEMPORADAS_DEFAULT, " ", " ");
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }


    @Override
    public String toString() {
        return "kjhxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "\n" +
                "*******************SERIES**************" + "\n" +
                "**\t Titulo: " + titulo + "\t **\n" +
                "**\t Numero Temporadas: " + numeroTemporadas + "\t \t \t **\n" +
                "**\t Genero: " + genero + "\t \t \t \t \t **\n" +
                "**\t Creador: " + creador + "\t \t **\n" +
                "***************************************";
    }

    public void entregar() {
        entregado = true;
    }

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

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    public int compareTo(Object a) {
        int estado = MENOR;
        Serie ref = (Serie) a;
        if (numeroTemporadas > ref.getNumeroTemporadas()) {
            estado = MAYOR;
        } else if (numeroTemporadas == ref.getNumeroTemporadas()) {
            estado = IGUAL;
        }
        return estado;
    }
}
