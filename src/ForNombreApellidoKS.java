public class ForNombreApellidoKS {
    public static void main(String[] args) {
        int f = 3;
        int c = 7;
        int fil = 7;
        int col = 7;
        for (int i = 0; i < f ; i++) {
            for (int j = 0; j < c; j++) {
                if (j == 0 || j == c-1) 
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();  
            c--;
        }   
        
        for(int k = 0; k <= f ; k++) {
            for (int l = 0; l <= c; l++) {
                if (l == 0 || l == k) 
                    System.out.print("*   ");
                else 
                    System.out.print(" ");
            }   
            c++;
            System.out.println();
        }
                
        System.out.println();
                
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == fil / 2 || i == fil - 1) {
                    System.out.print("*");
                } else if (i < fil / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > fil / 2 && j == col - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}