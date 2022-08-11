import OperacionesAlgebraicas.operaciones;

import java.util.Scanner;

public class operacionesmain {
    public static void main(String[] args){
        System.out.println("Programa que sume dos numeros usando Clases");

        int num1;
        int num2;

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del num1");
        num1 = read.nextInt();

        System.out.println("Ingrese el valor del num2");
        num2 = read.nextInt();

        operaciones oper1 = new operaciones(num1, num2);

        int suma = oper1.suma();
        System.out.println("la suma es: " + suma );

    }
}

