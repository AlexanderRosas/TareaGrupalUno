public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciales Katherine Sanchez");
        ForNombreK fk = new ForNombreK(); 
        ForApellidoS fs = new ForApellidoS();
        ForNombreApellidoKS fks = new ForNombreApellidoKS();
        WhileNombreK wk = new WhileNombreK();
        WhileApellidoS ws = new WhileApellidoS();
        WhileNombreApellidoKS wks = new WhileNombreApellidoKS();
        DoWhileNombreK dk = new DoWhileNombreK();
        DoWhileApellidoS ds = new DoWhileApellidoS();
        DoWhileNombreApellidoKS dks = new DoWhileNombreApellidoKS();

        fk.contador();
        fs.contador();
        fks.contador();
        wk.contador();
        ws.contador();
        wks.contador();
        dk.contador();
        ds.contador();
        dks.contador();
    }
}



