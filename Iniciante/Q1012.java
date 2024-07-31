package Iniciante;

import java.util.Scanner;

public class Q1012 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        
        Scanner scanner = new Scanner(System.in);
        
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = PI * C * C;
        double areaTrapezio = (A + B) / 2 * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
  
        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
        scanner.close();
    }
}
