package IntroducaoOO;

public class Conta {
    public int numeroConta;
    public String nomeTitular;
    public Double saldo;

    public Conta()  {
        System.out.println("Construtor vazio.");
    }

    public Conta(int numeroConta, String nomeTitular, Double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        System.out.println("Construtor com parâmetros.");
    }

    public void exibeBanco() {
        System.out.println("Banco Nubank.");
    }

    public void sacar(Double valor) {
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Quantia informada maior do que o saldo disponivel. Insira uma quantia valida.");

         }
      }

    public void extrato() {
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Nome do titular: " + this.saldo);
        System.out.println("Saldo: " + this.saldo + "R$");

    }
}
