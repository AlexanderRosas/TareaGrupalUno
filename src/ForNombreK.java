public class ForNombreK {
    public static void main(String[] args) {
        int f = 3;
        int c = 7;
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
    }
}