package com.company.operacionesConObjetos.actividades.series;

import com.company.obtener_valores.constantes;




public class MainEntregable {

    public static void main(String[] args) {
        Serie []listaSeries = new Serie[5];
        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("Midway", 3, "Drama", " Roland Emmerich");
        listaSeries[2] = new Serie("Los ángeles de Charlie", 4, "Accion", "Elizabeth Banks");
        listaSeries[3] = new Serie("Legado en los huesos", "Fernando González Molina");
        listaSeries[4] = new Serie("La gran mentira", "Bill Condon");


        VideoJuego []listavideojuegos = new VideoJuego[5];
        listavideojuegos[0] = new VideoJuego("Final Fantasy VII Remake", 45, "J", "");
        listavideojuegos[1] = new VideoJuego("Cyberpunk 2077", 23, "F", "Chris Roberts ");
        listavideojuegos[2] = new VideoJuego("Death Stranding", 56);
        listavideojuegos[3] = new VideoJuego("Star Citizen", 45, "E", "Chris Roberts");
        listavideojuegos[4] = new VideoJuego("Deep Down", 66, "A", " Yoshinori Ono y Teruki Miyashita ");


        listaSeries[2].entregar();
        listaSeries[0].entregar();
        listaSeries[3].entregar();
        listavideojuegos[3].entregar();
        listavideojuegos[2].entregar();
        listavideojuegos[1].entregar();

        int entregados = 0;
        for (int i = 0; i < listaSeries.length; i++) {
            if (listaSeries[i].isEstregado()) {
                entregados = entregados + 1;
                listaSeries[i].devolver();
            }
            if (listavideojuegos[i].isEstregado()) {
                entregados = entregados + 1;
                listavideojuegos[i].devolver();
            }
        }
        System.out.println("++++++++++++++Hay " + entregados + " articulos entregados++++++++++++++");

        Serie serieMayor = listaSeries[0];
        VideoJuego videojuegoMayor = listavideojuegos[0];

        for (int i = 1; i < listaSeries.length; i++) {
            if (listaSeries[i].compareTo(serieMayor) == Serie.MAYOR)
                serieMayor = listaSeries[i];
            {
                if (listavideojuegos[i].compareTo(videojuegoMayor) == constantes.MAYOR) {
                    videojuegoMayor = listavideojuegos[i];
                }

            }
        }
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);

    }

}
