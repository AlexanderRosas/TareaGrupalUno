
import ArielRosas.DoWhileSeriesAriel;
import ArielRosas.ForSeriesAriel;
import ArielRosas.InicialesArielRosas;
import ArielRosas.WhileSeriesAriel;
import KhaterineSanchez.DoWhileApellidoS;
import KhaterineSanchez.DoWhileNombreApellidoKS;
import KhaterineSanchez.DoWhileNombreK;
import KhaterineSanchez.ForApellidoS;
import KhaterineSanchez.ForNombreApellidoKS;
import KhaterineSanchez.ForNombreK;
import KhaterineSanchez.WhileApellidoS;
import KhaterineSanchez.WhileNombreApellidoKS;
import KhaterineSanchez.WhileNombreK;
import MarcoRios.forMarcoM;
import MarcoRios.forMarcoRiosMR;
import MarcoRios.forRiosR;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nIniciales Marco Rios:");
        forMarcoM nombremarco = new forMarcoM();
        nombremarco.nombremarcocicles();
        forRiosR apellidorios = new forRiosR();
        apellidorios.apellidorioscicles();
        forMarcoRiosMR nombreapellidomarco = new forMarcoRiosMR();
        nombreapellidomarco.marcorioscicles();

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
