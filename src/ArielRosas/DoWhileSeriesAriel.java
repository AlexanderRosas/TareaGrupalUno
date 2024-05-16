package ArielRosas;
public class DoWhileSeriesAriel {
    public void imprimirA(){
        int filas = 0;
        do {
            int columnas = 0;
            do {
                if (columnas == 0 || columnas == 5 || filas == 0 || filas == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columnas++;
            } while (columnas <= 5);
            System.out.println();
            filas++;
        } while (filas < 10);
        System.out.println("");
    }
    public void imprimirR(){
        int filas = 0;
        do {
            int columnas = 0;
            do {
                if (columnas == 0 || (columnas == 5 && filas <=5 ) || filas == 0 || filas == 5 || (filas>5 && filas == columnas+4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                columnas++;
            } while (columnas <= 5);
            System.out.println();
            filas++;
        } while (filas < 10);
        System.out.println("");
    }
}
