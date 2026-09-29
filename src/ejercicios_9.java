import java.util.Scanner;

public class ejercicios_9 {
    public static void main(String[] args){
        // EJERCICIO 9

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el área del circulo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio,2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("El área del circulo es: "+area);
    }
}