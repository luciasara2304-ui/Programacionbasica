import java.util.Objects;
import java.util.Scanner;

public class ejercicios_24 {
    public static void main(String[] args){

        // EJERCICIO 21
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el número del día de la semana que desea: ");
        int n=scanner.nextInt();

        switch (n){
            case 1:
                System.out.println("El día es: Lunes");
                break;
            case 2:
                System.out.println("El día es: Martes");
                break;
            case 3:
                System.out.println("El día es: Miércoles");
                break;
            case 4:
                System.out.println("El día es: Jueves");
                break;
            case 5:
                System.out.println("El día es: Viernes");
                break;
            case 6:
                System.out.println("El día es: Sábado");
                break;
            case 7:
                System.out.println("El día es: Domingo");
                break;
        }
    }
}