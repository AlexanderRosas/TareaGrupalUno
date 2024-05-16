package MarcoRios;
public class forMarcoRiosMR {
   
    public void marcorioscicles() {

        System.out.println("\nCICLO FOR MR:");
        int altura = 6;
        int i = 0;
        for (i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                if (j == 0 || j == altura * 2 - 2 || (i == j / 2 && j <= altura) || (i + j == altura * 2 - 3 && j >= altura)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.print("    "); 
            for (int j = 0; j < altura * 2 - 1; j++) {
                if (j == 0 || (i == 0 && j < altura - 1) || (i == altura / 2 && j < altura - 1) || (j == altura - 1 && i > 0 && i < altura / 2) || (i == j && j >= altura - 1) || (i + j == altura - 1 && j > altura - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }
        
        System.out.println("\nCICLO DO WHILE MR:");
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
            System.out.print("    "); 
            j = 0; // Reinicio de j
            while (j < altura * 2 - 1) {
                if (j == 0 || (i == 0 && j < altura - 1) || (i == altura / 2 && j < altura - 1) || (j == altura - 1 && i > 0 && i < altura / 2) || (i == j && j >= altura - 1) || (i + j == altura - 1 && j > altura - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
                j++; 
            }
            System.out.println();
            i++;
        } while (i < altura);
        
        
        

        System.out.println("\nCICLO WHILE MR:");
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
            System.out.print("    "); 
            j = 0; 
            while (j < altura * 2 - 1) {
                if (j == 0 || (i == 0 && j < altura - 1) || (i == altura / 2 && j < altura - 1) || (j == altura - 1 && i > 0 && i < altura / 2) || (i == j && j >= altura - 1) || (i + j == altura - 1 && j > altura - 1)) {
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