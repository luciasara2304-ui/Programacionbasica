import java.util.Scanner;

public class ejercicios3{
    public static void main(String[] args){
        // EJERCICIO 8

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el valor total de la compra realizada: ");
        double valor = scanner.nextDouble();

        double iva = valor*0.19;
        double valorbruto = valor - iva;
    }
}