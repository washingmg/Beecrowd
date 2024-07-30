package Iniciante;

// PROBLEMA: 1006 - Média 2

import java.util.Scanner;

public class Q1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        
        double media = (2 * A + 3 * B + 5 * C) / 10;
        
        System.out.printf("MEDIA = %.1f\n", media);
        scanner.close();
    }
}
