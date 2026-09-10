public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;
    

public ContaBancaria (String numeroConta, String titular, double saldo) {
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;

}
public void exibirDados () {
    System.out.println("Titular: " + titular);
    System.out.println("Numero da Conta: " + numeroConta);

}


public void depositar (double valor) {
    if (valor <= 0) {
    System.out.println("Valor inválido.");
    } else {
    saldo += valor;
    System.out.println("Depósito de " + valor + " foi realizado");
    }
}

public void sacar (double valor) {
    if (valor <= 0 || saldo == 0 || valor > saldo) {
        System.out.println("Operação inválida.");
    } else {
        saldo -= valor;
        System.out.println("Saque de " + valor + " foi realizado");
    }
}

public void exibirSaldo() {
    System.out.println("Saldo atual: " + saldo);
}
}