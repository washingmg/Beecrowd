package Iniciante;

// 1017 - Gasto de Combustível

import java.util.Scanner;

public class Q1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoGasto = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        
        int distancia = tempoGasto * velocidadeMedia;
        double litrosNecessarios = (double) distancia / 12;
        
        System.out.printf("%.3f\n", litrosNecessarios);
        scanner.close();
    }
}
