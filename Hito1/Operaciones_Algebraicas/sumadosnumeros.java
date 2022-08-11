import java.util.Scanner;

public class sumadosnumeros {
    public static void main(String[] args){
        System.out.println("Programa que sume dos numeros");

        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        int division;

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del num1");
        num1 = read.nextInt();

        System.out.println("Ingrese el valor del num2");
        num2 = read.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;



        System.out.println("El resultado es:" + suma);
        System.out.println("El resultado es:" + resta);
        System.out.println("El resultado es:" + multiplicacion);
        System.out.println("El resultado es:" + division);
    }
}
