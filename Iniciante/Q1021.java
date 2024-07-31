package Iniciante;

// PROBLEMA: 1021 - Notas e Moedas

import java.util.Scanner;

public class Q1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        final int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        final int[] moedas = {100, 50, 25, 10, 5, 1};

        int[] quantidadeNotas = new int[notas.length];
        int[] quantidadeMoedas = new int[moedas.length];

        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = centavos / notas[i];
            centavos %= notas[i];
        }

        for (int i = 0; i < moedas.length; i++) {
            quantidadeMoedas[i] = centavos / moedas[i];
            centavos %= moedas[i];
        }

        System.out.println("NOTAS:");
        int[] valoresNotas = {100, 50, 20, 10, 5, 2};
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d.00\n", quantidadeNotas[i], valoresNotas[i]);
        }

        System.out.println("MOEDAS:");
        double[] valoresMoedas = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        for (int i = 0; i < moedas.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas[i], valoresMoedas[i]);
        }
        scanner.close();
    }
}
