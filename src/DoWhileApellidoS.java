public class DoWhileApellidoS {
    public static void main(String[] args) {
        int f = 7;
        int c = 7;
        int i = 0;
        
        do{
            int j = 0;
            do{
                if (i == 0 || i == f / 2 || i == f - 1) {
                    System.out.print("*");
                } else if (i < f / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > f / 2 && j == c - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }while (j < c);
            System.out.println();
            i++;
        }while (i < f);
    }
}
