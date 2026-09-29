import java.util.Scanner;

public class ejercicios_12 {
    public static void main(String[] args){
        // EJERCICIO 12

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite 'x1': ");
        double x1=scanner.nextDouble();
        System.out.println("Digite 'x2': ");
        double x2=scanner.nextDouble();
        System.out.println("Digite 'y1': ");
        double y1=scanner.nextDouble();
        System.out.println("Digite 'y2': ");
        double y2=scanner.nextDouble();

        double diferenciaX = x2-x1;
        double diferenciaY = y2-y1;

        double distancia = Math.sqrt(Math.pow(diferenciaX,2)+Math.pow(diferenciaY,2));

        System.out.println("La distancia entre los puntos es: "+distancia);
    }
}