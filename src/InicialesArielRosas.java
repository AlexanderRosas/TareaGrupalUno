public class InicialesArielRosas {
    public void imprimirAR() {
        System.out.println("Iniciales Ariel Rosas");
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas <= 5; columnas++) {
                if (columnas == 0 || columnas == 5 || filas == 0 || filas == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int columnas = 6; columnas <= 11; columnas++) {
                if (columnas == 6 || (columnas == 11 && filas <=5 ) || filas == 0 || filas == 5 || (filas>5 && filas == columnas+4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}