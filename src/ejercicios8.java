import java.util.Scanner;

public class ejercicios8{
    public static void main(String[] args){
        // EJERCICIO 13

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el digito a convertir: ");
        int n = scanner.nextInt();

        int numero1 = n;
        int numero2 = (n*10)+n;
        int numero3 = (n*100) + (n*10) + n;

        System.out.println("El digito que usted ingresó es: "+numero1);
        System.out.println("El digito ingresado como 'nn' es: "+numero2);
        System.out.println("El digito ingresado como 'nnn' es: "+numero3);
    }
}