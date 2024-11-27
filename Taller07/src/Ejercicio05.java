import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String estudiante, estado;
        double promedio, contador = 1;
        while (contador <= 4){
            System.out.println("DAME NOMBRE Y PROMEDIO");
            estudiante = tcl.next();
            promedio = tcl.nextDouble();
            estado = (promedio >= 7) ? "APROBADO": "REPROBADO";
            System.out.println("Nombre\tPromedio\tEstado");
            System.out.println(estudiante + "\t" + promedio + "\t\t" + estado);
            contador++;
            
        }
    }
    
}
