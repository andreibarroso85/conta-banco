import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto scanner para ler os dados do terminal
        // Usando Locale.US para garantir que o saldo aceite ponto (ex: 237.48)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitando e lendo a Agência (Texto)
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicitando e lendo o Número da Conta (Inteiro)
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        
        // Consumindo a quebra de linha que sobra após o nextInt()
        scanner.nextLine();

        // Solicitando e lendo o Nome do Cliente (Texto)
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        // Solicitando e lendo o Saldo (Decimal)
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();

        // Imprimindo a mensagem final com os dados concatenados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
