import java.util.Scanner;

public class ValidaçãodeCartões {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do cartão: ");
        String numeroCartao = scanner.nextLine();


        if (numeroCartao.length() < 13 || numeroCartao.length() > 19) {
            System.out.println("Número de cartão inválido.");
            return;
        }

        if (numeroCartao.startsWith("4")) {
            System.out.println("Visa");
        } else if (numeroCartao.startsWith("51") || numeroCartao.startsWith("52") ||
                numeroCartao.startsWith("53") || numeroCartao.startsWith("54") ||
                numeroCartao.startsWith("55") ||
                (Integer.parseInt(numeroCartao.substring(0, 4)) >= 2221 &&
                        Integer.parseInt(numeroCartao.substring(0, 4)) <= 2720)) {
            System.out.println("Mastercard");
        } else if (numeroCartao.startsWith("4011") || numeroCartao.startsWith("4312") ||
                numeroCartao.startsWith("4389")) {
            System.out.println("Elo");
        } else if (numeroCartao.startsWith("34") || numeroCartao.startsWith("37")) {
            System.out.println("American Express");
        } else if (numeroCartao.startsWith("6011") || numeroCartao.startsWith("65") ||
                (Integer.parseInt(numeroCartao.substring(0, 3)) >= 644 &&
                        Integer.parseInt(numeroCartao.substring(0, 3)) <= 649)) {
            System.out.println("Discover");
        } else if (numeroCartao.startsWith("6062")) {
            System.out.println("Hipercard");
        } else {
            System.out.println("Bandeira de cartão desconhecida");
        }

        scanner.close();
    }
}
