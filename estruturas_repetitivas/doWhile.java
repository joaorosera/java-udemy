import java.util.Scanner;

public class DoWhileExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            System.out.println("Você digitou: " + numero);
        } while (numero != 0);

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
