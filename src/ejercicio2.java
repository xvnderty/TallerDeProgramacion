//Escribir un programa que resuelva una formula
// matematica que utilice al menos 3 variables
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n1,n2,n3;
        double prom;
        System.out.println("Ingrese nota1 :");
        n1 = lector.nextInt();
        
        System.out.println("Ingrese nota2 :");
        n2 = lector.nextInt();
        
        System.out.println("Ingrese nota3 :");
        n3 = lector.nextInt();
        prom = (n1+n2+n3)/3;
        
        System.out.println("Su promedio es de : "+prom);
    } 
}
