import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner (System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("--------- CONTA BANCÁRIA ---------");
        System.out.println();
        System.out.println("Por favor, digite o número da conta: (3245)");
        numero = scan.nextInt();

        System.out.println("Agora digite o número da Agência: (171-6)");
        agencia = scan.next();

        System.out.println("Me informe o seu nome: ");
        nomeCliente = scan.next();
        scan.nextLine();

        System.out.println("Agora me infomra seu saldo atual: ");
        saldo = scan.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar um conta em "
        + "nosso banco, sua agência é %s, "
        + "conta %d e seu saldo %.2f já está disponível"
        + " para saque.",nomeCliente, agencia, numero, saldo);

        scan.close();

    }
}
