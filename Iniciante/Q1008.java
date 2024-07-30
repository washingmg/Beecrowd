package Iniciante;

// PROBLEMA: 1008 - Salário

import java.util.Scanner;

public class Q1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        float n3 = scanner.nextFloat();

        float salario = n2 * n3;

        System.out.printf("NUMBER = %d\n", n1);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        scanner.close();
    }
}
