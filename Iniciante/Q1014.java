package Iniciante;

// PROBLEMA: 1014 - Consumo

import java.util.Scanner;

public class Q1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores de entrada
        int x = scanner.nextInt();
        float y = scanner.nextFloat();

        // Cálculo da eficiência de combustível
        float consumo = x / y;

        // Impressão do resultado formatado
        System.out.printf("%.3f km/l%n", consumo);
        scanner.close();;
    }
}
