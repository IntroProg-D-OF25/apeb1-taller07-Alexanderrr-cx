import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite, contador = 1;
                System.out.println("DAME EL LIMITE:");
                limite = tcl.nextInt();
                while (contador <= limite){
                    System.out.println(contador + "/" + (contador + 9) + ",");
                    contador++;
                    System.out.println("");
                    
                }
                
                
                        
        
    }
    
}
