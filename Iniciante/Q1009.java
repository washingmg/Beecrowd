package Iniciante;

// PROBLEMA: 1009 - Salário com Bônus

import java.util.Scanner;

class Q1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        @SuppressWarnings("unused")
        
        String name = scanner.nextLine();
        float salario = scanner.nextFloat();
        float venda = scanner.nextFloat();
        
        float total = (float) (salario + (venda * 0.15));
        total = Math.round(total * 100) / 100.0f;

        System.out.printf("TOTAL = R$ %.2f\n", total);
        scanner.close();
        
    }
}
