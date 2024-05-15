public class WhileApellidoS {
    public static void main(String[] args) {
        int f = 7;
        int c = 7;
        int i = 0;
        
        while (i < f) {
            int j = 0;
            while (j < c) {
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
            }
            System.out.println();
            i++;
        }
    }
}
