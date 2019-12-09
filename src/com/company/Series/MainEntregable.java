package com.company.Series;

public class MainEntregable {

    public static void main(String[] args) throws Exception {
        Serie listaSeries[] = new Serie[5];
        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("Midway", 3, "Drama", " Roland Emmerich");
        listaSeries[2] = new Serie("Los ángeles de Charlie", 4, "Accion", "Elizabeth Banks");
        listaSeries[3] = new Serie();
        listaSeries[3] = new Serie("Legado en los huesos", "Fernando González Molina");
        listaSeries[4] = new Serie("La gran mentira", "Bill Condon");


        videojuegos listavideojuegos[] = new videojuegos[5];
        listavideojuegos[0] = new videojuegos("Final Fantasy VII Remake", 45, "J", "");
        listavideojuegos[1] = new videojuegos("Cyberpunk 2077", 23, "F", "Chris Roberts ");

        listavideojuegos[2] = new videojuegos("Death Stranding", 56);
        listavideojuegos[3] = new videojuegos("Star Citizen", 45, "E", "Chris Roberts");
        listavideojuegos[4] = new videojuegos("Deep Down", 66, "A", " Yoshinori Ono y Teruki Miyashita ");


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
        videojuegos videojuegoMayor = listavideojuegos[0];

        for (int i = 1; i < listaSeries.length; i++) {
            if (listaSeries[i].compareTo(serieMayor) == Serie.MAYOR)
                serieMayor = listaSeries[i];
            {
                if (listavideojuegos[i].compareTo(videojuegoMayor) == videojuegos.MAYOR) {
                    videojuegoMayor = listavideojuegos[i];
                }

            }
        }
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);

    }

}
