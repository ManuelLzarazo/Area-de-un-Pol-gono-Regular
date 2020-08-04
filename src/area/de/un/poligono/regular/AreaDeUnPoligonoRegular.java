
package area.de.un.poligono.regular;

import java.util.Scanner;

public class AreaDeUnPoligonoRegular {

 
    public static void main(String[] args) {
        
    Scanner Teclado =new Scanner(System.in);

       
        double Longitud =0;

        double Nlados =0;

        double Area =0;

      System.out.println("Diguite el valor de la longitud del polígono");

        Longitud = Teclado.nextInt();

     System.out.println("Diguite la catidad de lados del polígono");

        Nlados = Teclado.nextInt();

                

        Area = (double)(Nlados*(Math.pow(Longitud,2)/(4*Math.tan(Math.PI/Nlados));
        
              

      System.out.println("El área del polígo es:"+Area);

      
     

}

    }




        
        
  
