import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite = 0, contador1 = 5, contador2 = 0;
        System.out.println("DAME EL LIMITE:");
        limite = tcl.nextInt();
        while (contador1 <= (limite*5)){
            System.out.println(contador1 + "/" + (contador2+10) + ",");
            contador1+=5;
            contador2+=2;
        }
        System.out.println("");
    }
}
