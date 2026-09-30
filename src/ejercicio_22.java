import java.util.Objects;
import java.util.Scanner;

public class ejercicio_22 {
    public static void main(String[] args){

        // EJERCICIO 22
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite el número a analizar: ");
        int n=scanner.nextInt();

        if(n>0 && n<100000){
            int digitos = String.valueOf(n).length();
            System.out.println("El número "+n+" tiene "+digitos+" digitos");
        }
        else{
            System.out.println("Este número no está dentro del rango");
        }
    }
}