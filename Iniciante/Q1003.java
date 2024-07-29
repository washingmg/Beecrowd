package Iniciante;

// PROBLEMA: 1003 - Soma Simples

import java.util.Scanner;

public class Q1003 { //main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.printf("SOMA = %d", n1 + n2);
        scanner.close();
    }
}
