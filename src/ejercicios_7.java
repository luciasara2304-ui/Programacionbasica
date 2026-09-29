import java.util.Scanner;

public class ejercicios_7 {
    public static void main(String[] args){

        // EJERCICIO 7
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
}