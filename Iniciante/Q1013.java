package Iniciante;

import java.util.Scanner;

public class Q1013 {
    public static int maior(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int resposta = maior(a, maior(b, c));

        System.out.printf("%d eh o maior%n", resposta);
        scanner.close();
    }
}

