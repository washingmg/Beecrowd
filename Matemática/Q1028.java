

// PROBLEMA: 1028 - Figurinhas


import java.util.Scanner;

public class Q1028 { //main

    public static int MDC(int a, int b) {
        return (b == 0) ? a : MDC(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtd = scanner.nextInt();
        
        for (int i = 0; i < qtd; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            System.out.println(MDC(n1, n2));
        }
        
        scanner.close();
    }
}