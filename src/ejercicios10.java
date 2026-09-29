import java.util.Scanner;

public class ejercicios10{
    public static void main(String[] args){
        // EJERCICIO 15-16

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el número a analizar: ");
        double numero = scanner.nextDouble();

        if(numero % 2 == 0){
            System.out.println("El número "+numero+ " es par");
        }
        else {
            System.out.println("El número "+numero+ " es impar");
        }

        if(numero > 0){
            System.out.println("El número "+numero+" es positivo");
        } else if (numero < 0) {
            System.out.println("El número "+numero+" es negativo");
        }
        else{
            System.out.println("El número no es positivo ni negativo");
        }

    }
}