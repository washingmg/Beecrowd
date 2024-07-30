

// PROBLEMA: 1197 - Volta à Faculdade de Física

import java.util.Scanner;

public class Q1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            try {
                int v = scanner.nextInt();
                int t = scanner.nextInt();
                System.out.println(v * 2 * t);
            } catch (Exception e) {
                break;
            }
        }
        scanner.close();
    }
}
