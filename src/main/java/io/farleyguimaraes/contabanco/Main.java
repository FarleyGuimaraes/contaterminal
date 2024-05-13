package io.farleyguimaraes.contabanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("informe o nome do cliente: ");
        String nomeCliente = scanner.next();
        
        System.out.print("Informe a agencia: ");
        String agencia = scanner.next();

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();
        
        ContaTerminal contaTerminal = new ContaTerminal(nomeCliente, agencia, numeroConta, saldo);
        

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",contaTerminal.getNomeCliente(),contaTerminal.getAgencia(),contaTerminal.getNumeroConta(),contaTerminal.getSaldo()));
    }
}