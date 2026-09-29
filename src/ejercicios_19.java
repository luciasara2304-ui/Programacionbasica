import java.util.Scanner;

public class ejercicios_19{
    public static void main(String[] args){

        // EJERCICIO 19
        Scanner scanner = new Scanner (System.in);
        System.out.println("RESOLVER UNA ECUACIÓN CUADRÁTICA");

        System.out.println("Digite el valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("Digite el valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("Digite el valor de c: ");
        double c = scanner.nextDouble();

        if(a == 0){
            System.out.println("No es una ecuación cuadrática");
        }
        else {
            double dentro = Math.pow(b,2)-(4*a*c);

            if(dentro > 0){
                double x1 = (-b + Math.sqrt(dentro))/(2*a);
                double x2 = (-b - Math.sqrt(dentro))/(2*a);
                System.out.println("Existen dos soluciones reales: ");
                System.out.println("x1= "+x1);
                System.out.println("x2= "+x2);
            } else if (dentro == 0) {
                double x1 = -b/(2*a);
                System.out.println("Existe una única solución real: ");
                System.out.println("x1 = x2 = "+x1);
            }
            else{
                System.out.println("La ecuación no tiene soluciones reales (solo imaginarias)");
            }
        }
    }
}