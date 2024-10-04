package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m;
        double n;
        double x;
        double y;
        String nombre;

        System.out.println("Ingrese el numero m: "); //sout salto de linea e impresion
        m = scanner.nextDouble();
        System.out.println("Ingrese el numero n: ");
        n = scanner.nextDouble();
        System.out.println("Ingrese el i iterable: ");
        x = scanner.nextDouble();
        for (double i = x ; i <= n; i += m) {
            System.out.println(i);
        }
        System.out.println("###############");
        System.out.println("Ingrese el nombre: ");
        nombre = scanner.next();
        for (int i = 0 ; i <= 50; i ++) {
            System.out.println("Su nombre es: " + nombre);

        }
        System.out.println("#############");
        System.out.println("Ingrese un numero: ");
        y = scanner.nextDouble();
        for (double i = 2 ; i <= y; i ++) {
            int cont = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    cont++;
                }
            }
            if (cont == i){
                System.out.println(i);
            }
        }
        System.out.println("###############");
        System.out.println("Hola Mundo");
    }
}