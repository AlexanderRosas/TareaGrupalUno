package KhaterineSanchez;
public class WhileNombreApellidoKS{
    public static void main(String[] args) {
        int bordeIz;
        int contador;
        int bordeVer;
        int bordeHor;
        int fil = 7;
        int col = 7;
        int i = 0;
        boolean posi =true;
        boolean posib =true;
        while (posi){
            bordeIz = 3;
            contador = 6;
            bordeHor = 0;
            posi=true;
            while(bordeHor < bordeIz){
                bordeVer = 0;
                while (bordeVer < contador) {
                    if (bordeVer == 0 || bordeVer == contador-1) 
                        System.out.print("*");
                    else 
                        System.out.print(" ");
                    bordeVer++; 
                }
                    System.out.println();
                contador--;
                bordeHor++;  
                if(bordeHor == bordeIz)
                    posi=false;  
            }
        }
        while (posib){
            bordeIz = 4;
            contador = 6;
            bordeHor = 0;
            while(bordeHor < bordeIz){
                bordeVer = 0;
                while(bordeVer < contador){
                    if (bordeVer == 0 || bordeVer == bordeHor) 
                        System.out.print("*  ");
                    else 
                        System.out.print(" "); 
                    bordeVer++; 
                }
                System.out.println();
                bordeHor++;    
            }
            if(bordeHor == bordeIz)
                posib=false;
        }
        System.out.println();
        
        while (i < fil) {
            int j = 0;
            while (j < col) {
                if (i == 0 || i == fil / 2 || i == fil - 1) {
                    System.out.print("*");
                } else if (i < fil / 2 && j == 0) {
                    System.out.print("*");
                } else if (i > fil / 2 && j == col - 1) {
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