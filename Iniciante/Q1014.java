package Iniciante;

// PROBLEMA: 1014 - Consumo

import java.util.Scanner;

public class Q1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        float y = scanner.nextFloat();
        float consumo = x / y;

        System.out.printf("%.3f km/l%n", consumo);
        scanner.close();;
    }
}
