package Iniciante;

// PROBLEMA: 1004 - Produto Simples

import java.util.Scanner;

public class Q1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int produto = x * y;
        
        System.out.printf("PROD = %d\n", produto);
        scanner.close();
    }
}
