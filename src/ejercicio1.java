//Escribir un programa que calcule 
//el área de una figura geométrica cualquiera.
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese la altura del triangulo: ");
        double altura = lector.nextDouble();
        
        System.out.println("ingrese la base del triangulo: ");
        double base = lector.nextDouble();
        
        double area = (base*altura)/2;
        System.out.println("El AREA DEL TRIANGULO ES : "+area);
    }
}
