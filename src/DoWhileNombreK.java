public class DoWhileNombreK {
    public static void main(String[] args) {
        int bordeIz;
        int contador;
        int bordeVer;
        int bordeHor;
        int f = 7;
        int c = 7;
        int i = 0;
        boolean posi =true;
        boolean posib =true;
        do{
            bordeIz = 3;
            contador = 6;
            bordeHor = 0;
            posi=true;
            do{
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
            }while(bordeHor < bordeIz);
        }while(posi);

        do{
            bordeIz = 4;
            contador = 6;
            bordeHor = 0;
            do{
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
            }while(bordeHor < bordeIz);
            if(bordeHor == bordeIz)
                posib=false;
        }while (posib);
    

        System.out.println();
    
        do{
            int j = 0;
            do{
                if (i == 0 || i == f / 2 || i == f - 1) {
                    System.out.print("*");
                } 
                else if (i < f / 2 && j == 0) {
                    System.out.print("*");
                } 
                else if (i > f / 2 && j == c - 1) {
                    System.out.print("*");
                } 
                else {
                System.out.print(" ");
                }
                    j++;
                }while (j < c);
                System.out.println();
                i++;
            }while (i < f);
    }
}

