import java.util.Objects;
import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args){}


    public static void ejercicio_1(){
        System.out.println("Hola mundo");
    }

    public static void ejercicio_2(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola " +nombre);
    }

    public static void ejercicio_3(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Qué número al cuadrado necesitas saber?");
        double numero = scanner.nextDouble();
        double cuadrado = Math.pow(numero,2);
        System.out.println("El cuadrado del número es: "+cuadrado);
    }

    public static void ejercicio_4y5(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite el segundo número: ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de sus dos números es: "+suma);
        int resta = numero1 - numero2;
        System.out.println("La resta de sus dos números es: "+resta);
        int mul = numero1 * numero2;
        System.out.println("La multi de sus dos números es: "+mul);
        float div = (float) numero1 / numero2;
        System.out.println("La div de sus dos números es: "+div);

    }

    public static void ejercicio_6(){
        Scanner scanner = new Scanner (System.in);
        double num = 40.516;
        int entero = (int) num;
        double decimal = num - entero;
        System.out.println("Parte entera: "+ entero);
        System.out.println("Parte decimal: "+ decimal);
    }

    public static void ejercicio_7(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite su primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite su segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite su tercera nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite su cuarta nota: ");
        double nota4 = scanner.nextDouble();
        System.out.println("Digite su quinta nota: ");
        double nota5 = scanner.nextDouble();

        double calcularpromedio = (nota1*0.15)+(nota2*0.20)+(nota3*0.15)+(nota4*0.30)+(nota5*0.20);

        System.out.println("Su promedio es: "+calcularpromedio);
    }

    public static void ejercicio_8(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el valor bruto de la compra realizada: ");
        double valorbruto = scanner.nextDouble();

        double iva = valorbruto*0.19;
        double valortotal = valorbruto + iva;

        System.out.println("El precio bruto de su producto es: "+ valorbruto);
        System.out.println("El iva del producto es: "+iva);
        System.out.println("El valor total del producto agregando el IVA es: "+valortotal);
    }

    public static void ejercicio_9(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite el área del circulo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio,2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("El área del circulo es: "+area);
    }

    public static void ejercicio_10(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite la longitud de un lado del hexágono: ");
        double lado = scanner.nextDouble();
        System.out.println("Digite el apotema del hexagono: ");
        double apotema = scanner.nextDouble();

        double perimetro = lado*6;
        double area =(perimetro*apotema)/2;

        System.out.println("El área del hexagono es: "+area);
    }

    public static void ejercicio_11(){
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

    public static void ejercicio_12(){
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

    public static void ejercicio_13(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el digito a convertir: ");
        int n = scanner.nextInt();

        int numero1 = n;
        int numero2 = (n*10)+n;
        int numero3 = (n*100) + (n*10) + n;

        System.out.println("El digito que usted ingresó es: "+numero1);
        System.out.println("El digito ingresado como 'nn' es: "+numero2);
        System.out.println("El digito ingresado como 'nnn' es: "+numero3);
    }

    public static void ejercicio_14(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad total de segundos: ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600)/60;
        int segundos = (totalSegundos % 3600)%60;

        System.out.println(horas + ":"+minutos+":"+segundos);
    }

    public static void ejercicio_15(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el número a analizar: ");
        double numero = scanner.nextDouble();

        if(numero % 2 == 0){
            System.out.println("El número "+numero+ " es par");
        }
        else {
            System.out.println("El número "+numero+ " es impar");
        }
    }

    public static void ejercicio_16(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el número a analizar: ");
        double numero = scanner.nextDouble();

        if(numero > 0){
            System.out.println("El número "+numero+" es positivo");
        } else if (numero < 0) {
            System.out.println("El número "+numero+" es negativo");
        }
        else{
            System.out.println("El número no es positivo ni negativo");
        }
    }

    public static void ejercicio_17(){
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

    public static void ejercicio_18(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite su segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite su tercera nota: ");
        double nota3 = scanner.nextDouble();
        System.out.println("Digite su cuarta nota: ");
        double nota4 = scanner.nextDouble();
        System.out.println("Digite su quinta nota: ");
        double nota5 = scanner.nextDouble();

        double calcularpromedio = (nota1*0.15)+(nota2*0.20)+(nota3*0.15)+(nota4*0.30)+(nota5*0.20);

        if(calcularpromedio < 2.0){
            System.out.println("Su promedio es: "+calcularpromedio+" por tanto NO PODRÁ HABILITAR");
        } else if (calcularpromedio > 3) {
            System.out.println("Su promedio es: "+calcularpromedio+ " ha APROBADO la asignatura");
            if(calcularpromedio > 4.5){
                System.out.println("¡FELICITACIONES POR SU ESFUERZO!");
            }
        }
    }

    public static void ejercicio_19(){
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

    public static void ejercicio_20(){
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

    public static void ejercicio_21(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el número a pasar a texto: ");
        int n=scanner.nextInt();

        switch (n){
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
        }
    }

    public static void ejercicio_22(){
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

    public static void ejercicio_23(){
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

    public static void ejercicio_24(){
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

    public static void ejercicio_25(){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingresa la frase que deseas invertir: ");
        String frase = scanner.nextLine();

        StringBuilder invertido = new StringBuilder();
        for (int i = frase.length()-1; i >=0 ; i--) {
            invertido.append(frase.charAt(i));
        }

        System.out.println("El texto invertido es: "+invertido);
    }

    public static void ejercicio_26(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la frase a usar: ");
        String frase = scanner.nextLine();

        String resultado = "";

        for (String palabra: frase.split(" ")){
            if(palabra.isEmpty()){
                System.out.println("Está vacía");
            }
            else {
                resultado = resultado + Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1)+" ";
            }
        }

        System.out.println("La frase es: " + resultado.trim());
    }

    public static void ejercicio_27(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el texto: ");
        String texto = scanner.nextLine();

        String[] palabras = texto.trim().split(" ");

        if(palabras.length >= 2){
            String penultima = palabras[palabras.length-2];
            System.out.println("La penúltima palabra es: "+penultima);
        }
        else{
            System.out.println("El texto debe tener al menos dos palabras");
        }
    }

    public static void ejercicio_28(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer texto (texto principal): ");
        String texto_1 = scanner.nextLine();
        System.out.println("Ingrese el segundo texto (texto a buscar): ");
        String texto_2 = scanner.nextLine();

        if(texto_1.contains(texto_2)){
            System.out.println("El primer texto SI contiene el segundo");
        }
        else{
            System.out.println("El primer texto NO contiene el segundo");
        }
    }

    public static void ejercicio_29(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la palabra a verificar si es o no palindromo");
        String palabra = scanner.nextLine();

        boolean esPalindromo = palabra.contentEquals(new StringBuilder(palabra).reverse());

        if(esPalindromo){
            System.out.println("La palabra "+palabra+" SI es palindromo");
        }
        else{
            System.out.println("La palabra "+palabra+" NO es palindromo");
        }
    }

    public static void ejercicio_30(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de vértices que tiene la figura: ");
        int vertices = scanner.nextInt();

        if(vertices < 3){
            System.out.println("Un poligono debe tener almenos 3 vértices");
        }
        else{
            double[]x = new double[vertices];
            double[]y = new double[vertices];

            System.out.println("Ingresa las cordenadas en orden alrededor de la figura");
            for (int i = 0; i < vertices; i++) {
                System.out.println("Vértice "+(i+1)+" en X");
                x[i] = scanner.nextDouble();
                System.out.println("Vértice "+(i+1)+" en Y");
                y[i] = scanner.nextDouble();
            }

            double suma1 = 0;
            double suma2 = 0;

            for (int i = 0; i < vertices; i++) {
                int siguiente = i+1;
                if(siguiente == vertices){
                    siguiente = 0;
                }

                suma1 = suma1 +(x[i] * y[siguiente]);
                suma2 = suma2 + (y[i] * x[siguiente]);
            }

            double area = Math.abs(suma1-suma2) / 2.0;

            System.out.println("El área total del poligono es igual a: "+area);
        }
    }

    public static void ejercicio_31(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }

    public static void ejercicio_32(){
        for (int i = 1; i < 10; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void ejercicio_33(){
        for (int i = 1; i < 10; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void ejercicio_34(){
        Scanner scanner = new Scanner(System.in);

        int num;
        do{
            System.out.println("Digite un número entero positivo");
            num = scanner.nextInt();

        } while(num<=0);

        System.out.println("Usted dijito el número "+num);
    }

    public static void ejercicio_35(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el decimal a convertir a binario: ");
        int decimal = scanner.nextInt();

        int num = decimal;
        long binario = 0;
        long posicion = 1;

        while (num>0){
            int residuo = num%2;
            binario = binario + (residuo*posicion);
            posicion = posicion*10;
            num = num/2;
        }

        System.out.println("Su decimal "+decimal+" en binario es "+binario);
    }
}


