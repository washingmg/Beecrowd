package Iniciante;

// 1019 - Conversão de Tempo

import java.util.Scanner;

public class Q1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();
        
        int horas = tempo / 3600; 
        int minutos = (tempo % 3600) / 60; 
        int segundos = tempo % 60; 
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        scanner.close();
    }
}

