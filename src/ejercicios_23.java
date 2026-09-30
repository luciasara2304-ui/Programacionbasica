import java.util.Scanner;

public class ejercicios_23 {
    public static void main(String[] args){

        // EJERCICIO 23
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite el primer número: ");
        double num1=scanner.nextDouble();
        System.out.println("Digite el segundo número: ");
        double num2=scanner.nextDouble();
        System.out.println("Digite el tercer número: ");
        double num3=scanner.nextDouble();


        if(num1>num2 && num2>num3){
            System.out.println("Los números están disminuyendo");
        }
        else if(num1<num2 && num2<num3){
            System.out.println("Los números están aumentando");
        } else {
            System.out.println("Los números no aumentan ni disminuyen");
        }
    }
}