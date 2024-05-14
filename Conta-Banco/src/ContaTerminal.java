import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();

        input.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = input.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = input.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + ", e seu saldo " + saldo + " já está disponível para saque." );

        input.close();
    }
}