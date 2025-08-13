// Escribir un programa que , dado un monto total,
// lo desconponga en monto a pagar e igv (18%)
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese su codigo su salario mensual : ");
        int salario = lector.nextInt();
        
        double total = (salario*0.18);
        System.out.println("IGV(18%)="+total);
        
        double nuevoMonto = salario-total;
        System.out.println("NUEVO MONTO: "+nuevoMonto);
    }
}
