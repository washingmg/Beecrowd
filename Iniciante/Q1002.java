package Iniciante;

// PROBLEMA: 1010 - Cálculo Simples

import java.util.Scanner;

public class Q1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        @SuppressWarnings("unused")
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        
        @SuppressWarnings("unused")
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        
        
        float soma = (y * z) + (b * c);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);
        scanner.close();
    
    }
}
