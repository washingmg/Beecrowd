package Iniciante;

// 1016 - Distância

import java.util.Scanner;

public class Q1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int minutos = scanner.nextInt();
        int time = minutos * 2;

        System.out.printf("%d minutos\n", time);
        scanner.close();
    }
}
