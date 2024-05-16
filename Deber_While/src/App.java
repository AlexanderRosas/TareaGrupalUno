public class App {
    public static void main(String[] args) throws Exception {
        WhileJ jWhile;

        jWhile = new WhileJ();

        jWhile.imprimirJW();
        
        WhileS sWhile;

        sWhile = new WhileS();

        sWhile.imprimirSW();

        WhileJS jsWhile;

        jsWhile = new WhileJS();

        jsWhile.imprimirJSW();

        ImprimirJGrande jGrande;
        jGrande = new ImprimirJGrande();
        jGrande.imprimirJGrande1();
    }
}
