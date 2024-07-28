

// PROBLEMA: 1168 - LED


import java.util.HashMap;
import java.util.Scanner;

public class Q1168 { //Q1168 it's main.
    public static void main(String[] args) {
        HashMap<Character, Integer> leds = new HashMap<>();
        leds.put('1', 2);
        leds.put('2', 5);
        leds.put('3', 5);
        leds.put('4', 4);
        leds.put('5', 5);
        leds.put('6', 6);
        leds.put('7', 3);
        leds.put('8', 7);
        leds.put('9', 6);
        leds.put('0', 6);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String number = scanner.next();
            int totalLeds = 0;

            for (char digit : number.toCharArray()) {
                totalLeds += leds.get(digit);
            }

            System.out.printf("%d leds%n",totalLeds);
        }
        scanner.close();
    }
}
