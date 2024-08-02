package Iniciante;

// 1036 - Fórmula de Bhaskara

import java.util.Scanner;

public class Q1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double discriminante = b * b - 4 * a * c;

            if (discriminante < 0) {
                System.out.println("Impossivel calcular");
            } else {
                double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                System.out.printf("R1 = %.5f%n", raiz1);
                System.out.printf("R2 = %.5f%n", raiz2);
            }
        }
        scanner.close();
    }
}
