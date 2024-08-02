import java.util.Scanner;

// 1234 - Sentença Dançante

public class Q1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(transformarSentencaDancante(linha));
        }
        scanner.close();
    }

    private static String transformarSentencaDancante(String sentenca) {
    
        StringBuilder resultado = new StringBuilder();

        boolean maiuscula = true;
        
        for (char ch : sentenca.toCharArray()) {
            if (ch == ' ') {
                resultado.append(ch);
            } else {
                if (maiuscula) {
                    resultado.append(Character.toUpperCase(ch));
                } else {
                    resultado.append(Character.toLowerCase(ch));
                }

                maiuscula = !maiuscula;
            }
        }
        return resultado.toString();
    }
}
