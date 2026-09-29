import java.util.Scanner;

public class ejercicios_10 {
    public static void main(String[] args){
        // EJERCICIO 10

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite la longitud de un lado del hexágono: ");
        double lado = scanner.nextDouble();
        System.out.println("Digite el apotema del hexagono: ");
        double apotema = scanner.nextDouble();

        double perimetro = lado*6;
        double area =(perimetro*apotema)/2;

        System.out.println("El área del hexagono es: "+area);
    }
}