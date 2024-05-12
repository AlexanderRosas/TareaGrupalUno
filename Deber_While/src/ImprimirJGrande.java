public class ImprimirJGrande {
    public void imprimirJGrande1(){
        int filas = 7;
        int columnasJ = 5;
        int columnasS = 6;
        int fila = 0;
        int columna = 0;

        while (fila < filas) {
            columna = 0;
            while (columna < columnasJ) {
                if (fila == 0 || columna == columnasJ - 3 || (fila == filas - 1 && columna < columnasJ - 2)) {
                    System.out.print("J ");
                } else {
                    System.out.print("  ");
                }
                columna++;
            }
            System.out.print("  "); // Espacio entre la 'J' y la 'S'

            columna = 0;
            while (columna < columnasS) {
                if ((fila == 0 || fila == filas - 1) || (fila == filas / 2 && (columna == 0 || columna == columnasS - 1))) {
                    System.out.print("S ");
                } else if (fila < filas / 2 && columna == 0) {
                    System.out.print("S ");
                } else if (fila > filas / 2 && columna == columnasS - 1) {
                    System.out.print("S ");
                } else {
                    System.out.print("  ");
                }
                columna++;
            }
            System.out.println(); // Salto de línea después de cada fila
            fila++;
        }
    }
}
        
