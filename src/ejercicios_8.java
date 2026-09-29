import java.util.Scanner;

public class ejercicios_8 {
    public static void main(String[] args){
        // EJERCICIO 8

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el valor bruto de la compra realizada: ");
        double valorbruto = scanner.nextDouble();

        double iva = valorbruto*0.19;
        double valortotal = valorbruto + iva;

        System.out.println("El precio bruto de su producto es: "+ valorbruto);
        System.out.println("El iva del producto es: "+iva);
        System.out.println("El valor total del producto agregando el IVA es: "+valortotal);
    }
}