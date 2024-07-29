package Iniciante;

// PROBLEMA: 1005 - Média 1

import java.util.Scanner;

public class Q1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        
        double media = (3.5 * A + 7.5 * B) / 11;
        
        System.out.printf("MEDIA = %.5f\n", media);
        scanner.close();
    }
}