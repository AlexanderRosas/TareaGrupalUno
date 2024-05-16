public class WhileSeriesAriel {
    public void imprimirA(){
        int filas = 0;
        while (filas < 10) {
            int columnas = 0;
            while (columnas <= 5) {
                if (columnas == 0 || columnas == 5 || filas == 0 || filas == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columnas++;
            }
            System.out.println();
            filas++;
        }
        System.out.println("");
    }
    public void imprimirR(){
        int filas = 0;
        while (filas < 10) {
            int columnas = 0;
            while (columnas <= 5) {
                if (columnas == 0 || (columnas == 5 && filas <=5 ) || filas == 0 || filas == 5 || (filas>5 && filas == columnas+4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columnas++;
            }
            System.out.println();
            filas++;
        }
        System.out.println("");
    }

}

