import java.util.Objects;
import java.util.Scanner;

public class ejercicios_20 {
    public static void main(String[] args){

        // EJERCICIO 20
        Scanner scanner = new Scanner (System.in);
        String usuario = "carlos";
        int codigo = 1234;

        System.out.println("Digite su usuario: ");
        String su_usuario = scanner.nextLine();
        System.out.println("Digite su contraseña: ");
        int contrasena = scanner.nextInt();

        if (Objects.equals(su_usuario, usuario) && contrasena == codigo){
            System.out.println("Usuario y contraseña coinciden");
            System.out.println("Acceso concedido, ¡BIENVENIDO!");
        }
        else {
            System.out.println("Usuario y/o contraseña no coinciden");
            System.out.println("Accedo denegado");
        }
    }
}