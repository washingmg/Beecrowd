package Iniciante;

// 1001 - Extremamente Básico

import java.util.Scanner;

public class Q1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int x = a + b;
        
        System.out.println("X = " + x);
        scanner.close();
    }
}

