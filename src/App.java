public class App {
    public static void main(String[] args) throws Exception {
        ForSeriesAriel fs = new ForSeriesAriel();
        WhileSeriesAriel ws = new WhileSeriesAriel();
        DoWhileSeriesAriel dw = new DoWhileSeriesAriel();
        InicialesArielRosas ia = new InicialesArielRosas();

        System.out.println("Letra A y R");
        ia.imprimirAR();
        System.out.println("Ciclos For");
        System.out.println("Letra A");
        fs.imprimirA();
        System.out.println("Letra R");
        fs.imprimirR();
        System.out.println("");
        System.out.println("Ciclos DoWhile");
        dw.imprimirA();
        dw.imprimirR();
        System.out.println("");
        System.out.println("Ciclos While");
        ws.imprimirA();
        ws.imprimirR();
    }
}
