import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
   
        int contador = 1, limite;
        
        Scanner tcl = new Scanner(System.in);
        System.out.println("DAME EL LIMITE");
        limite = tcl.nextInt();
        
        while (contador <= limite){
            if (contador % 2 == 1){
                System.out.print("-(1/"+contador+")");
        }else {
                System.out.print("+(1/"+contador+")");
        }
        contador++;  
        }
        System.out.println("");   
    }
    
}
