package Exemplos;

public class Executor {

    public static void main(String[] args) {
        Conta conta1 = new Conta(1, "Thiago", 20.0, "Poupança");
        Conta conta2 = new Conta(2, "Pedro", 1000.0, "Corrente");
        //conta.extrato();
        //conta1.depositar(22.0);
        //conta.extrato();
        //conta.exibeBanco();

        conta1.extrato();
        conta2.extrato();
        conta1.transferir(conta2, 10.0);
        conta1.extrato();
        conta2.extrato();
    }
}