public class InicialesArielRosas {
    public static void main(String[] args) {
        int altura = 10;  // Altura de las letras
        int anchuraA = 5; // Anchura de la A
        int anchuraR = 5; // Anchura de la R

        System.out.println("Iniciales Ariel Rosas");
        // Impresion de la Letra A
        for (int filas = 0; filas < altura; filas++) {
            for (int columnas = 0; columnas <= anchuraA; columnas++) {
                if (columnas == 0 || columnas == anchuraA || filas == 0 || (filas == altura / 2 && columnas < anchuraA)) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            // Espacio entre A y R
            System.out.print("  ");
            // Imprimir la letra R
            for (int columnas = 0; columnas <= anchuraR; columnas++) {
                // Parte superior de la R
                if (columnas == 0 || (columnas == anchuraR && filas < altura / 2) || filas == 0 || (filas == altura / 2 && columnas != anchuraR)) {
                    System.out.print("R");
                }
                // La diagonal inferior de la R
                else if (filas > altura / 2 && columnas == filas - altura / 2 + 1) {
                    System.out.print("R");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}