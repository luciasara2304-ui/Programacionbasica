import java.util.Scanner;

public class ejercicios6{
    public static void main(String[] args){
        // EJERCICIO 11

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite la cantidad de números a los cuales se les calculará el promedio: ");
        int n = scanner.nextInt();
        int i=0;
        double suma=0;

        while (i<n){
            System.out.println("Digite el número a agregar para calcular el promedio: ");
            double num=scanner.nextDouble();

            suma = suma+num;
            i+=1;
        }

        double prom = suma/n;
        System.out.println("El promedio de los números ingresados es: "+prom);
    }
}