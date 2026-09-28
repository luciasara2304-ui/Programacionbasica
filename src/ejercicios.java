import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        // EJERCICIO 2
        System.out.println("Digite su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola " +nombre);

        //EJERCICIO 3
        System.out.println("¿Qué número al cuadrado necesitas saber?");
        double numero = scanner.nextDouble();
        double cuadrado = Math.pow(numero,2);
        System.out.println("El cuadrado del número es: "+cuadrado);

        //EJERCICIO 4-5
        System.out.println("Digite el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite el segundo número: ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de sus dos números es: "+suma);
        int resta = numero1 - numero2;
        System.out.println("La resta de sus dos números es: "+resta);
        int mul = numero1 * numero2;
        System.out.println("La multi de sus dos números es: "+mul);
        float div = (float) numero1 / numero2;
        System.out.println("La div de sus dos números es: "+div);

        //EJERCICIO 6
        double num = 40.516;
        int entero = (int) num;
        double decimal = num - entero;
        System.out.println("Parte entera: "+ entero);
        System.out.println("Parte decimal: "+ decimal);
    }
}
