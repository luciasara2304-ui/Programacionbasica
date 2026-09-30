import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args){}
    public static void ejercicio_1(){
        System.out.println("Hola mundo");
    }

    public static void ejercicio_2(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola " +nombre);
    }

    public static void ejercicio_3(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Qué número al cuadrado necesitas saber?");
        double numero = scanner.nextDouble();
        double cuadrado = Math.pow(numero,2);
        System.out.println("El cuadrado del número es: "+cuadrado);
    }

    public static void ejercicio_4y5(){
        Scanner scanner = new Scanner (System.in);
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

    }

    public static void ejercicio_6(){
        Scanner scanner = new Scanner (System.in);
        double num = 40.516;
        int entero = (int) num;
        double decimal = num - entero;
        System.out.println("Parte entera: "+ entero);
        System.out.println("Parte decimal: "+ decimal);
    }

    public static void ejercicio_7(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite su primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite su segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite su tercera nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite su cuarta nota: ");
        double nota4 = scanner.nextDouble();
        System.out.println("Digite su quinta nota: ");
        double nota5 = scanner.nextDouble();

        double calcularpromedio = (nota1*0.15)+(nota2*0.20)+(nota3*0.15)+(nota4*0.30)+(nota5*0.20);

        System.out.println("Su promedio es: "+calcularpromedio);
    }

    public static void ejercicio_8(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el valor bruto de la compra realizada: ");
        double valorbruto = scanner.nextDouble();

        double iva = valorbruto*0.19;
        double valortotal = valorbruto + iva;

        System.out.println("El precio bruto de su producto es: "+ valorbruto);
        System.out.println("El iva del producto es: "+iva);
        System.out.println("El valor total del producto agregando el IVA es: "+valortotal);
    }

    public static void ejercicio_9(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el área del circulo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio,2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("El área del circulo es: "+area);
    }

    public static void ejercicio_10(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite la longitud de un lado del hexágono: ");
        double lado = scanner.nextDouble();
        System.out.println("Digite el apotema del hexagono: ");
        double apotema = scanner.nextDouble();

        double perimetro = lado*6;
        double area =(perimetro*apotema)/2;

        System.out.println("El área del hexagono es: "+area);
    }

    public static void ejercicio_11(){

    }
}


