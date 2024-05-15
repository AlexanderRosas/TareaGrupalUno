public class ForApellidoS {
    public static void main(String[] args) {
        int f = 7;
        int c = 7;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == f / 2 || i == f - 1) {
                    System.out.print("*");
                } else if (i < f / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > f / 2 && j == c - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
