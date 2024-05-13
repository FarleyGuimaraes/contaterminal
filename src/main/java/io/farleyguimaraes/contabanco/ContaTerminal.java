package io.farleyguimaraes.contabanco;

public class ContaTerminal {

    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
    
    ContaTerminal(String nomeCliente, String agencia, int numeroConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String getAgencia() {
        return agencia;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void alterarNomeCliente(String novoNomeCliente) {
        this.nomeCliente = novoNomeCliente;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void saque(int valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        } else {
            System.out.println("Saque não efetuado: Saldo insuficiente!");
        }
    }

    public void deposito(int valor){
        if(valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("Deposito não efetuado: Valor inválido!");
        }
    }
    
}
