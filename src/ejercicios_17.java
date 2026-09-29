import java.util.Scanner;

public class ejercicios_17 {
    public static void main(String[] args){
        // EJERCICIO 17

        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el valor bruto de la compra realizada: ");
        double valorbruto = scanner.nextDouble();

        double iva = valorbruto*0.19;
        double valortotal = valorbruto + iva;

        System.out.println("El precio bruto de su producto es: "+ valorbruto);
        System.out.println("El iva del producto es: "+iva);
        System.out.println("El valor total del producto agregando el IVA es: "+valortotal);

        if (valortotal > 150000){
            double descuento = valortotal *0.05;
            double TOTAL = valortotal - descuento;

            System.out.println("Su descuento es de: "+descuento);
            System.out.println("Compra con descuento del 5% adicional: "+TOTAL);
        }
        else {
            System.out.println("Su compra no supera la cantidad, por tanto, no hay descuento adicional");
        }
    }
}