import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreEmpleado;
        double diasTrabajados, pagoDia, valorPagar, contador = 1;
        while (contador <= 5) {
            System.out.println("DAME NOMBRE DEL EMPLEADO, DIAS TRABAJADOS"
            + "COSTO DEL DIA");
            nombreEmpleado = tcl.next();
            diasTrabajados = tcl.nextDouble();
            pagoDia = tcl.nextDouble();
            
            valorPagar = (diasTrabajados * pagoDia);
            System.out.println("\"Nombre empleado\tDiasTrabajados\t\t" 
            + "PagoDia\tValor a Pagar");
            System.out.println(nombreEmpleado + "\t\t\t" + diasTrabajados
            + "\t\t\t" + pagoDia + "\t\t" + valorPagar);
            contador++;
    }
    }
    
}
