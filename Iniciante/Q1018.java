package Iniciante;

// PROBLEMA: 1018 - Cédulas

import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das cédulas
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        // Leitura do valor de entrada
        int dinheiro = scanner.nextInt();
        System.out.println(dinheiro);

        // Processamento das cédulas
        for (int valor : cedulas) {
            int quantidade = dinheiro / valor;
            System.out.println(quantidade + " nota(s) de R$ " + valor + ",00");
            dinheiro %= valor;
        }
        scanner.close();
    }
}
