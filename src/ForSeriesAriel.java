public class ForSeriesAriel {
    public void imprimirA(){
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas <= 5; columnas++) {
                if (columnas == 0 || columnas == 5 || filas == 0 || (filas == 10 / 2 && columnas < 5)) {
                    System.out.print("*");
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
                if (columnas == 0 || (columnas == 5 && filas <=5 ) || filas == 0 || filas == 5 || (filas>5 && filas == columnas+4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
       }
       System.out.println("");
    }
}

