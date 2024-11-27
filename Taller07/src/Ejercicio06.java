import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        double precioInicial, precioFinal;
        int tipoCliente, contador = 0;
        
        System.out.println("Registro de venrtas:");
        while (contador < 7){
            System.out.println("\nIngrese los datos para la venta #" + (contador + 1));
            
            System.out.print("Nombre del cliente: ");
            nombre = tcl.nextLine();
            
            System.out.print("Costo de la computadora: ");
            precioInicial = tcl.nextDouble();
            
            System.out.print("Tipo de cliente (1, 2, o cualquier otro numero): ");
            tipoCliente = tcl.nextInt();
            tcl.nextLine();
            if (tipoCliente == 1) {
                precioFinal = precioInicial * (1 - 0.10);
            } else if (tipoCliente == 2) {
                precioFinal = precioInicial * (1 - 0.20);
            } else {
                precioFinal = precioInicial;
            }
            System.out.printf("Cliente: %s, Tipo: %d, Compra computadora con "
                              + "precio original $%.2f y precio final $%.2f%n",
                              nombre, tipoCliente, precioInicial, precioFinal);
            contador++;
        }
    }
    
}
