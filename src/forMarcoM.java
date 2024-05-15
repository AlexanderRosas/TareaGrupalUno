public class forMarcoM {
   
    public void nombremarcocicles() {
        System.out.println("\nCICLO FOR M:");
        int altura = 7;
        int i = 0;
        for (i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\nCICLO DO WHILE M:");
        i = 0;
        do {
            int j = 0;
            while (j < altura * 2 - 1) {
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        } while (i < altura);   

        System.out.println("\nCICLO WHILE M:");
        i = 0;
        while (i < altura) {
            int j = 0;
            while (j < altura * 2 - 1) {
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}