package desafio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**Bem vindo ao cadastro de conta**");

        System.out.println("Por favor, digite o nome do titular.");
        String nome = sc.next();

        System.out.println("Agora, digite o número da agência.");
        String agencia = sc.next();

        System.out.println("Informe o número da conta.");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o saldo.");
        double saldo = sc.nextDouble();

        String mensagemFinal = "Olá, ".concat(nome).concat("! Obrigado por abrir sua conta com a gente. Sua agência é a ")
                .concat(agencia).concat(", conta n. ").concat(String.valueOf(numeroConta)).concat(" e seu saldo de R$ ")
                .concat(String.valueOf(saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagemFinal);

    }
}