import java.util.Scanner;

public class ejercicios9{
    public static void main(String[] args){
        // EJERCICIO 14

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad total de segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600)/60;
        int segundos = (totalSegundos % 3600)%60;

        System.out.println(horas + ":"+minutos+":"+segundos);

    }
}