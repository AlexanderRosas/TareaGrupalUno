public class ForSeriesAriel {
    public void imprimirA(){
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas <= 5; columnas++) {
                if (columnas == 0 || columnas == 5 || filas == 0 || (filas == 10 / 2 && columnas < 5)) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }
    public void imprimirR(){
        for (int filas = 0; filas < 10; filas++){
            for (int columnas = 0; columnas <= 5; columnas++) {
                // Parte superior de la R
                if (columnas == 0 || (columnas == 5 && filas < 10 / 2) || filas == 0 || (filas == 10 / 2 && columnas != 5)) {
                    System.out.print("R");
                }
                // La diagonal inferior de la R
                else if (filas > 10 / 2 && columnas == filas - 10 / 2 + 1) {
                    System.out.print("R");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
       }
       System.out.println("");
    }
}
